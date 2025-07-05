package com.example.recipemealapi

import android.Manifest
import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.annotation.RequiresPermission
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.navigation3.runtime.rememberNavBackStack
import com.example.recipemealapi.MainNavigation.MNavigation
import com.example.recipemealapi.NavRoutes.MRoutes
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ui.theme.RecipeMealAPITheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            RecipeMealAPITheme {

                val backStack = rememberNavBackStack<MRoutes>(MRoutes.MainScreen)
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

