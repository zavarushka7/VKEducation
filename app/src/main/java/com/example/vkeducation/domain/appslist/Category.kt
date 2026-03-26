package com.example.vkeducation.domain.appslist

enum class Category{
    FINANCE,
    TOOLS,
    TRANSPORT,
    OTHER;

    fun getCategory(): String {
        return when(this) {
            FINANCE -> "Финансы"
            TOOLS -> "Инструменты"
            TRANSPORT -> "Транспорт"
            OTHER -> "Другое"
        }
    }
}


