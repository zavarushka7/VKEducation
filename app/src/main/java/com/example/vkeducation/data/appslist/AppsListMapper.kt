package com.example.vkeducation.data.appslist

import com.example.vkeducation.domain.appslist.App


class AppsListMapper {
    fun toDomain(dto: AppsListDto): App = App(
        id = dto.id,
        name = dto.name,
        description = dto.description,
        category = dto.category,
        iconUrl = dto.iconUrl
    )
}