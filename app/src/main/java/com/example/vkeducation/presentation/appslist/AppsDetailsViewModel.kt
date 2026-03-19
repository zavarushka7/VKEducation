package com.example.vkeducation.presentation.appslist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class AppsDetailsViewModel : ViewModel() {
    private val _state = MutableStateFlow<AppsDetailsState>(AppsDetailsState.Loading)
    val state = _state.asStateFlow()

    private val _events = Channel<AppsDetailsEvent>(Channel.BUFFERED)
    val events = _events.receiveAsFlow()

    init {
        loadApps()
    }

    fun loadApps() {
        viewModelScope.launch {
            _state.value = AppsDetailsState.Loading

            runCatching {
                delay(2.seconds)
                getMockApps()
            }.onSuccess { apps ->
                _state.value = AppsDetailsState.Content(apps = apps)
            }.onFailure {
                _state.value = AppsDetailsState.Error
            }
        }
    }

    fun onLogoClick() {
        viewModelScope.launch {
            _events.send(AppsDetailsEvent.ShowSnackbar("Приложение в разработке"))
        }
    }

    private fun getMockApps(): List<App> {
        return listOf(
            App(
                id = "1",
                name = "СберБанк Онлайн - с Салютом",
                description = "Больше чем банк",
                category = "Финансы",
                iconUrl = "https://static.rustore.ru/imgproxy/XazdQWatYRC8soN-K-yZa5c_Svw-I6X7XrA0AvmYoC0/preset:vk_og_img/plain/https://static.rustore.ru/apk/462271/content/ICON/f1b3c68a-b734-48ce-b62f-490208d3fa0e.png@webp",
            ),
            App(
                id = "2",
                name = "Яндекс.Браузер - с Алисой",
                description = "Быстрый и безопасный браузер",
                category = "Инструменты",
                iconUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ29dsoXNX8xMUjmJwkYV91ExWzp8xdDKQxFw&s"
            ),
            App(
                id = "3",
                name = "Почта Mail.ru",
                description = "Почтовый клиент для любых ящиков",
                category = "Инструменты",
                iconUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKgMBfD1oNsXwA3qfM1poC8ET5S292Jks7mg&s"
            ),
            App(
                id = "4",
                name = "Яндекс Навигатор",
                description = "Парковки и заправки - по пути",
                category = "Транспорт",
                iconUrl = "https://play-lh.googleusercontent.com/aROhxD1HNPLqW1ZiQzCxhDmx700j2g1VGZ0DPDualQxATkCkUEOWWCxxq0BSnZ3fynEe"
            ),
            App(
                id = "5",
                name = "Мой МТС",
                description = "Мой МТС - центр экосистемы МТС",
                category = "Инструменты",
                iconUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdK9Dr-e91nBqOIRabfUH9pWmaXJ0UfDWCeA&s"
            ),
            App(
                id = "6",
                name = "Яндекс - с Алисой",
                description = "Яндекс - поиск всегда под рукой",
                category = "Инструменты",
                iconUrl = "https://softdaily.ru/wp-content/uploads/2020/03/Yandex-Alice.png"
            ),
            App(
                id = "7",
                name = "Приложение",
                description = "Описание приложения",
                category = "Категория",
                iconUrl = "https://habrastorage.org/getpro/habr/upload_files/c8d/997/b1f/c8d997b1f05db23fce36f52a26d62680.jpg"
            )
        )
    }
}