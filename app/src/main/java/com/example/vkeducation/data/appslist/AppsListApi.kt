package com.example.vkeducation.data.appslist

import com.example.vkeducation.domain.appslist.Category
import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppsListApi @Inject constructor() {
    suspend fun get(): List<AppsListDto> {
        delay(2000)
        return listOf(
            AppsListDto(
                id = "1",
                name = "СберБанк Онлайн - с Салютом",
                description = "Больше чем банк",
                category = Category.FINANCE,
                iconUrl = "https://static.rustore.ru/imgproxy/XazdQWatYRC8soN-K-yZa5c_Svw-I6X7XrA0AvmYoC0/preset:vk_og_img/plain/https://static.rustore.ru/apk/462271/content/ICON/f1b3c68a-b734-48ce-b62f-490208d3fa0e.png@webp",
            ),
            AppsListDto(
                id = "2",
                name = "Яндекс.Браузер - с Алисой",
                description = "Быстрый и безопасный браузер",
                category = Category.TOOLS,
                iconUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ29dsoXNX8xMUjmJwkYV91ExWzp8xdDKQxFw&s"
            ),
            AppsListDto(
                id = "3",
                name = "Почта Mail.ru",
                description = "Почтовый клиент для любых ящиков",
                category = Category.TOOLS,
                iconUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKgMBfD1oNsXwA3qfM1poC8ET5S292Jks7mg&s"
            ),
            AppsListDto(
                id = "4",
                name = "Яндекс Навигатор",
                description = "Парковки и заправки - по пути",
                category = Category.TRANSPORT,
                iconUrl = "https://play-lh.googleusercontent.com/aROhxD1HNPLqW1ZiQzCxhDmx700j2g1VGZ0DPDualQxATkCkUEOWWCxxq0BSnZ3fynEe"
            ),
            AppsListDto(
                id = "5",
                name = "Мой МТС",
                description = "Мой МТС - центр экосистемы МТС",
                category = Category.TOOLS,
                iconUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdK9Dr-e91nBqOIRabfUH9pWmaXJ0UfDWCeA&s"
            ),
            AppsListDto(
                id = "6",
                name = "Яндекс - с Алисой",
                description = "Яндекс - поиск всегда под рукой",
                category = Category.TOOLS,
                iconUrl = "https://softdaily.ru/wp-content/uploads/2020/03/Yandex-Alice.png"
            ),
            AppsListDto(
                id = "7",
                name = "Приложение",
                description = "Описание приложения",
                category = Category.OTHER,
                iconUrl = "https://habrastorage.org/getpro/habr/upload_files/c8d/997/b1f/c8d997b1f05db23fce36f52a26d62680.jpg"
            )
        )
    }
}