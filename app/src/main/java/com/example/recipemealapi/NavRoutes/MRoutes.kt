package com.example.recipemealapi.NavRoutes


import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class MRoutes() : NavKey{

    @Serializable
    data object MainScreen: MRoutes()

    @Serializable
    data object CategoryDetailsScreen: MRoutes()
}