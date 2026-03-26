package com.example.vkeducation.domain.appslist

data class App(
    val id: String,
    val name: String,
    val description: String,
    val category: Category,
    val iconUrl: String,
)