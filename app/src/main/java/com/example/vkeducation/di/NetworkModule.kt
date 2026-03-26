package com.example.vkeducation.di

import com.example.vkeducation.data.appslist.AppsListApi
import com.example.vkeducation.data.appslist.AppsListMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.example.vkeducation.data.appdetails.AppApi
import com.example.vkeducation.data.appdetails.AppDetailsMapper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideAppApi(): AppApi = AppApi()

    @Provides
    @Singleton
    fun provideAppsListApi(): AppsListApi = AppsListApi()

    @Provides
    @Singleton
    fun provideAppDetailsMapper(): AppDetailsMapper = AppDetailsMapper()

    @Provides
    @Singleton
    fun provideAppsListMapper(): AppsListMapper = AppsListMapper()
}