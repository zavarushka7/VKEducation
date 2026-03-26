package com.example.vkeducation.domain.appslist

interface AppsListRepository {
    suspend fun getApps(): List<App>
}