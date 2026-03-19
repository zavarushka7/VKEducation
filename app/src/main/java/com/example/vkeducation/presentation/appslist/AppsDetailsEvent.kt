package com.example.vkeducation.presentation.appslist

sealed interface AppsDetailsEvent {
    data object UnderDevelopment : AppsDetailsEvent
    data class ShowSnackbar(val message: String) : AppsDetailsEvent
}