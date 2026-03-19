package com.example.vkeducation.presentation.appslist


sealed interface AppsDetailsState {
    data object Error : AppsDetailsState
    data object Loading : AppsDetailsState
    data class Content(
        val apps: List<App>,
    ) : AppsDetailsState
}