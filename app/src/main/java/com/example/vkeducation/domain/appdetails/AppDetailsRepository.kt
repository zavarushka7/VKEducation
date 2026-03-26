package com.example.vkeducation.domain.appdetails

interface AppDetailsRepository {
    suspend fun get(): AppDetails
}