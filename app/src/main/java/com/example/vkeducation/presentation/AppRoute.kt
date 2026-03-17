package com.example.vkeducation.presentation

sealed class AppRoute(val route: String) {
    object AppsList : AppRoute("apps_list")
    object AppDetails : AppRoute("app_details")
}