package com.example.recipemealapi

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.WindowCompat
import androidx.navigation3.runtime.rememberNavBackStack
import com.example.recipemealapi.MainNavigation.MNavigation
import com.example.recipemealapi.NavRoutes.MRoutes
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ui.theme.RecipeMealAPITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            RecipeMealAPITheme {

                val backStack = rememberNavBackStack<MRoutes>(MRoutes.FoodDetailsScreen)
                val viewModel = viewModels<MealViewModel>()

                val context = LocalContext.current
                SideEffect {
                    val window = (context as Activity).window

                    WindowCompat.getInsetsController(window, window.decorView).isAppearanceLightStatusBars = true
//                    window.statusBarColor = Color.YELLOW
                }
                MNavigation(
                    backStack,
                    viewModel.value,
                    applicationContext
                )
            }
        }
    }
}

