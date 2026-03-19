package com.example.vkeducation.presentation

sealed interface AppDetailsEvent {
    data object UnderDevelopment : AppDetailsEvent
    data class ShowSnackbar(val message: String) : AppDetailsEvent
}