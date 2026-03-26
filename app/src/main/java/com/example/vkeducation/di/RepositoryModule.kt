package com.example.vkeducation.di

import com.example.vkeducation.data.appslist.AppsListRepositoryImpl
import com.example.vkeducation.domain.appslist.AppsListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.example.vkeducation.data.appdetails.AppDetailsRepositoryImpl
import com.example.vkeducation.domain.appdetails.AppDetailsRepository

import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindAppDetailsRepository(
        impl: AppDetailsRepositoryImpl
    ): AppDetailsRepository

    @Binds
    @Singleton
    abstract fun bindAppsListRepository(
        impl: AppsListRepositoryImpl
    ): AppsListRepository
}