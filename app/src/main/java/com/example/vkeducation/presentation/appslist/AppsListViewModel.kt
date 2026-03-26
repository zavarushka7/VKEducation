package com.example.vkeducation.presentation.appslist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vkeducation.data.appslist.AppsListApi
import com.example.vkeducation.data.appslist.AppsListMapper
import com.example.vkeducation.data.appslist.AppsListRepositoryImpl
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch


class AppsListViewModel : ViewModel() {
    private val repository = AppsListRepositoryImpl(AppsListMapper(), AppsListApi())
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