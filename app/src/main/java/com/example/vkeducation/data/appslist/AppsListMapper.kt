package com.example.vkeducation.data.appslist

import com.example.vkeducation.domain.appslist.App
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class AppsListMapper @Inject constructor() {
    fun toDomain(dto: AppsListDto): App = App(
        id = dto.id,
        name = dto.name,
        description = dto.description,
        category = dto.category,
        iconUrl = dto.iconUrl
    )
}