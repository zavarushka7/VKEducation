package com.example.vkeducation.data.appdetails

import com.example.vkeducation.domain.appdetails.AppDetails
import com.example.vkeducation.domain.appdetails.AppDetailsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDetailsRepositoryImpl @Inject constructor(
    private val appApi: AppApi,
    private val mapper: AppDetailsMapper
): AppDetailsRepository {
    override suspend fun get(): AppDetails {
        val dto = appApi.get()
        val domain = mapper.toDomain(dto)
        return domain
    }
}