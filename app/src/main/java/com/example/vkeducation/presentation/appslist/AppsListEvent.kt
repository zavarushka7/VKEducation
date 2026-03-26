package com.example.vkeducation.presentation.appslist

sealed interface AppsListEvent {
    data object UnderDevelopment : AppsListEvent
    data class ShowSnackbar(val message: String) : AppsListEvent
}