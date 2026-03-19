package com.example.vkeducation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vkeducation.presentation.AppDetailsScreen
import com.example.vkeducation.presentation.AppRoute
import io.mmaltsev.vkeducation.AppDetailsFullScreen
import io.mmaltsev.vkeducation.ui.theme.VkEducationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VkEducationTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = AppRoute.AppsList.route
                ) {
                    composable(AppRoute.AppsList.route) {
                        AppDetailsScreen(
                            navController = navController,
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    composable("app_details") {
                        AppDetailsFullScreen(
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }

            }
        }
    }
}

