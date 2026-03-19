package com.example.vkeducation.data.appslist

import com.example.vkeducation.domain.appslist.Category


data class AppsListDto (
    val id: String,
    val name: String,
    val description: String,
    val category: Category,
    val iconUrl: String,
)