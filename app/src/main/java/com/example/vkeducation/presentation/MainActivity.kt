package com.example.vkeducation.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vkeducation.presentation.appslist.AppsRoute
import com.example.vkeducation.presentation.appslist.AppsDetailsScreen
import com.example.vkeducation.presentation.appdetails.AppDetailsScreen
import dagger.hilt.android.AndroidEntryPoint
import com.example.vkeducation.presentation.theme.VkEducationTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VkEducationTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = AppsRoute.AppsList.route
                ) {
                    composable(AppsRoute.AppsList.route) {
                        AppsDetailsScreen(
                            navController = navController,
                            modifier = Modifier.Companion.fillMaxSize()
                        )
                    }

                    composable("app_details") {
                        AppDetailsScreen()
                    }
                }

            }
        }
    }
}

