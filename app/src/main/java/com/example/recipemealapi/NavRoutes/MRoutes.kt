package com.example.recipemealapi.NavRoutes


import androidx.navigation3.runtime.NavKey
import com.example.recipemealapi.RoomDatabase.SaveEntity
import kotlinx.serialization.Serializable

sealed class MRoutes() : NavKey{

    @Serializable
    data object MainScreen: MRoutes()

    @Serializable
    data class FoodDetailsScreen(
        val mealId: Int?,
        val mealName:String,
        val mealDisc:String,
    ) : MRoutes()

    @Serializable
    data class CategoryDetailsScreen(
        val dishName: String,
        val disc: String,
    ): MRoutes()

    @Serializable
    data class SavedFoodDetails(
        val entity: SaveEntity,
    ): MRoutes()
}