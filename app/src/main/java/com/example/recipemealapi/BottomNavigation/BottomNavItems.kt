package com.example.recipemealapi.BottomNavigation

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.recipemealapi.NavRoutes.BottomNavRoutes
import com.example.recipemealapi.NavRoutes.BottomNavRoutes.CatagoriesScreen
import com.example.recipemealapi.NavRoutes.BottomNavRoutes.Profile
import com.example.recipemealapi.NavRoutes.BottomNavRoutes.Saved
import com.example.recipemealapi.R
import com.example.recipemealapi.Screens.BottomNavScreens.SavedScreen


data class BottomNavItem(
    val name: String,
    val icon: Int,
    val iconFilled: Int,
    val route: BottomNavRoutes,
)

val itemLists = listOf(
    BottomNavItem(
        name = "Home",
        icon = R.drawable.home,
        iconFilled = R.drawable.home_filled,
        route = CatagoriesScreen
    ),
    BottomNavItem(
        name = "Search",
        icon = R.drawable.search,
        iconFilled = R.drawable.search_filled,
        route = BottomNavRoutes.SearchScreen
    ),
    BottomNavItem(
        name = "Saved",
        icon = R.drawable.saved,
        iconFilled = R.drawable.saved_filled,
        route = Saved
    ),
    BottomNavItem(
        name = "Profile",
        icon = R.drawable.profile,
        iconFilled = R.drawable.profile_filled,
        route = Profile
    ),
)