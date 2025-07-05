package com.example.recipemealapi.Screens

import android.Manifest
import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.widget.GridLayout
import androidx.annotation.RequiresPermission
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.rememberNavBackStack
import com.example.recipemealapi.BottomNavigation.BNavigation
import com.example.recipemealapi.BottomNavigation.CBotomNavigationBar
import com.example.recipemealapi.Cards.CategoryCard
import com.example.recipemealapi.NavRoutes.BottomNavRoutes
import com.example.recipemealapi.R
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ui.theme.CSearch
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(mainBackStack: NavBackStack, viewModels: MealViewModel,context: Context) {
    val backStack = rememberNavBackStack<BottomNavRoutes>(BottomNavRoutes.CatagoriesScreen)
    val context = LocalContext.current
//    SideEffect {
//        val window = (context as Activity).window
////        window.statusBarColor = .White.toArgb()  // or any color
//        val insetsController = WindowCompat.getInsetsController(window, window.decorView)
//        insetsController.isAppearanceLightStatusBars = true  // true = dark icons
//    }
    Scaffold(
        modifier  = Modifier
            .background(CategoryScreen)
            .fillMaxSize(),
        bottomBar = {
            CBotomNavigationBar(backStack)
        },
        containerColor = CategoryScreen

    ) { innerPadding ->
        BNavigation(
            backStack, innerPadding,
            context = context,
            viewModel = viewModels

        )
    }

}

