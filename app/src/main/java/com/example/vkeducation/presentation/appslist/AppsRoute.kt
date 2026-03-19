package com.example.vkeducation.presentation.appslist

sealed class AppsRoute(val route: String) {
    object AppsList : AppsRoute("apps_list")
    object AppDetails : AppsRoute("app_details")
}