package com.example.vkeducation.presentation.appslist


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vkeducation.domain.appslist.AppsListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class AppsListViewModel @Inject constructor(
    private val repository: AppsListRepository
) : ViewModel() {
    private val _state = MutableStateFlow<AppsListState>(AppsListState.Loading)
    val state = _state.asStateFlow()

    private val _events = Channel<AppsListEvent>(Channel.BUFFERED)
    val events = _events.receiveAsFlow()

    init {
        loadApps()
    }

    fun loadApps() {
        viewModelScope.launch {
            _state.value = AppsListState.Loading

            runCatching {
                repository.getApps()
            }.onSuccess { apps ->
                _state.value = AppsListState.Content(apps = apps)
            }.onFailure {
                _state.value = AppsListState.Error
            }
        }
    }

    fun onLogoClick() {
        viewModelScope.launch {
            _events.send(AppsListEvent.ShowSnackbar("Приложение в разработке"))
        }
    }


}