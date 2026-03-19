package com.example.vkeducation.domain.appslist

interface AppsListsRepository {
    fun get(id: String?): App
}