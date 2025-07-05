package com.example.recipemealapi.MainNavigation

import android.Manifest
import android.content.Context
import androidx.annotation.RequiresPermission
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.example.recipemealapi.Screens.MainScreen
import com.example.recipemealapi.NavRoutes.MRoutes
import com.example.recipemealapi.Screens.SecondScreen
import com.example.recipemealapi.ViewModel.MealViewModel

@Composable
fun MNavigation(backStack: NavBackStack, viewModel: MealViewModel, context: Context) {

    NavDisplay(
        backStack = backStack,
        onBack = {
//            backStack.removeAll{true}
//            backStack.removeLastOrNull()
        },
        entryProvider = entryProvider {

            entry(MRoutes.MainScreen) @androidx.annotation.RequiresPermission(android.Manifest.permission.ACCESS_NETWORK_STATE) {
                MainScreen(backStack, viewModel, context = context)
            }

            entry(MRoutes.SecondScreen) {
                SecondScreen()
            }


        }
    )

}