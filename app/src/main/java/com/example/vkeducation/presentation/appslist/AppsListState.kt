package com.example.vkeducation.presentation.appslist

import com.example.vkeducation.domain.appslist.App


sealed interface AppsListState {
    data object Error : AppsListState
    data object Loading : AppsListState
    data class Content(
        val apps: List<App>,
    ) : AppsListState
}