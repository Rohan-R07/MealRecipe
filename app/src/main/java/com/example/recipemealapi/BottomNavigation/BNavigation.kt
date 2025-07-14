package com.example.recipemealapi.BottomNavigation

import android.content.Context
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.example.recipemealapi.NavRoutes.BottomNavRoutes
import com.example.recipemealapi.Screens.BottomNavScreens.CatalogScreen
import com.example.recipemealapi.Screens.BottomNavScreens.ProfileScreen
import com.example.recipemealapi.Screens.BottomNavScreens.SavedScreen
import com.example.recipemealapi.Screens.BottomNavScreens.SearchScreen
import com.example.recipemealapi.ViewModel.MealViewModel

@Composable
fun BNavigation(
    bottomBackStack: NavBackStack,
    innerPadding: PaddingValues,
    viewModel: MealViewModel,
    context: Context,
    mainBackStack: NavBackStack,
    navIndext: MutableState<Int>
) {

    NavDisplay(
        backStack = bottomBackStack,
        onBack = {
            bottomBackStack.lastOrNull()
        },
        entryProvider = entryProvider {

            entry(BottomNavRoutes.CatagoriesScreen) {
                CatalogScreen(
                    viewModel,
                    bottomBackStack,
                    context,
                    mainBackStack = mainBackStack
                )
            }
            entry(BottomNavRoutes.SearchScreen) {
                SearchScreen(
                    viewModel = viewModel,
                    context,
                    mainBackStack,
                    navIndext
                )
            }
            entry(BottomNavRoutes.Saved) { SavedScreen() }
            entry(BottomNavRoutes.Profile) { ProfileScreen() }


        },
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
    )

}