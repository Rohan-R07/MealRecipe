package com.example.recipemealapi.BottomNavigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
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
import com.example.recipemealapi.ui.theme.CategoryScreen

@Composable
fun BNavigation(backStack: NavBackStack,innerPadding: PaddingValues) {

    NavDisplay(
        backStack = backStack,
        onBack = {
            backStack.lastOrNull()
        },
        entryProvider = entryProvider {

            entry(BottomNavRoutes.CatagoriesScreen) { CatalogScreen() }
            entry(BottomNavRoutes.SearchScreen) { SearchScreen() }
            entry(BottomNavRoutes.Saved) { SavedScreen() }
            entry(BottomNavRoutes.Profile) { ProfileScreen() }


        },
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
    )

}