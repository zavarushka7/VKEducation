package com.example.vkeducation.presentation


sealed interface AppDetailsState {
    data object Error : AppDetailsState
    data object Loading : AppDetailsState
    data class Content(
        val apps: List<App>,
    ) : AppDetailsState
}