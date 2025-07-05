package com.example.recipemealapi.NavRoutes

import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class BottomNavRoutes : NavKey{

    @Serializable
    data object CatagoriesScreen : BottomNavRoutes()

    @Serializable
    data object SearchScreen : BottomNavRoutes()

    @Serializable
    data object Saved : BottomNavRoutes()

    @Serializable
    data object Profile : BottomNavRoutes()

}

