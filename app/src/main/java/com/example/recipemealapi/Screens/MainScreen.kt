package com.example.recipemealapi.Screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.rememberNavBackStack
import com.example.recipemealapi.BottomNavigation.BNavigation
import com.example.recipemealapi.BottomNavigation.CBotomNavigationBar
import com.example.recipemealapi.NavRoutes.BottomNavRoutes
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ui.theme.CategoryScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(mainBackStack: NavBackStack, viewModels: MealViewModel,context: Context) {
    val bottomBackStack = rememberNavBackStack<BottomNavRoutes>(BottomNavRoutes.CatagoriesScreen)
    val context = LocalContext.current

    val bottomNavIndext = remember { mutableIntStateOf(0) }
    Scaffold(
        modifier  = Modifier
            .background(CategoryScreen)
            .fillMaxSize(),
        bottomBar = {
            CBotomNavigationBar(bottomBackStack,bottomNavIndext)
        },
        containerColor = CategoryScreen

    ) { innerPadding ->
        BNavigation(
            bottomBackStack = bottomBackStack,
            innerPadding = innerPadding,
            context = context,
            viewModel = viewModels,
            mainBackStack = mainBackStack,
            navIndext = bottomNavIndext

        )
    }

}

