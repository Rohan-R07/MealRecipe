package com.example.recipemealapi.MainNavigation

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.example.recipemealapi.Screens.MainScreen
import com.example.recipemealapi.NavRoutes.MRoutes
import com.example.recipemealapi.Screens.CategoryDetailsScreen
import com.example.recipemealapi.Screens.FoodDetailsScreen
import com.example.recipemealapi.Screens.SavedFoodDetails
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ViewModel.SavingViewModel

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
@Composable
fun MNavigation(backStack: NavBackStack, viewModel: MealViewModel, context: Context,savingViewModel: SavingViewModel) {

    NavDisplay(
        backStack = backStack,
        onBack = {
            backStack.removeLastOrNull()
        },
        entryProvider = entryProvider {

            entry(MRoutes.MainScreen) {
                MainScreen(backStack, viewModel, context = context,savingViewModel)
            }

            entry<MRoutes.CategoryDetailsScreen> { key ->
                CategoryDetailsScreen(viewModel, topBarTitle = key.dishName, discroption = key.disc, mainBackStack =backStack,context )
            }

            entry<MRoutes.FoodDetailsScreen> { key ->
                FoodDetailsScreen(viewModel,key.mealId,backStack,key.mealName,key.mealDisc,context,savingViewModel)
            }

            entry<MRoutes.SavedFoodDetails> { key ->
                SavedFoodDetails(key.entity, mainBackStact = backStack)
            }

        }

    )

}