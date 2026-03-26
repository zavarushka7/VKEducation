package com.example.vkeducation.data.appdetails

import com.example.vkeducation.domain.appdetails.AppDetails
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDetailsMapper @Inject constructor() {
    fun toDomain(dto: AppDetailsDto): AppDetails = AppDetails(
        name = dto.name,
        developer = dto.developer,
        category = dto.category,
        ageRating = dto.ageRating,
        size = dto.size.toFloat(),
        iconUrl = dto.icon,
        screenshotUrlList = dto.screenshots,
        description = dto.description,
    )
}