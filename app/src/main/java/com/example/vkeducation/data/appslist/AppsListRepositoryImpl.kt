package com.example.vkeducation.data.appslist

import com.example.vkeducation.domain.appslist.App
import com.example.vkeducation.domain.appslist.AppsListRepository

class AppsListRepositoryImpl(
    private val mapper: AppsListMapper,
    private val api: AppsListApi
) : AppsListRepository {
    override suspend fun getApps(): List<App> {
        val dto = api.get()
        return dto.map { dto ->
            mapper.toDomain(dto)
        }
    }
}