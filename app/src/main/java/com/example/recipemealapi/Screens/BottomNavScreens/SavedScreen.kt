package com.example.recipemealapi.Screens.BottomNavScreens

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import com.example.recipemealapi.Cards.CategoryDetailsCard
import com.example.recipemealapi.NavRoutes.MRoutes
import com.example.recipemealapi.R
import com.example.recipemealapi.Screens.CategoryDetailsScreen
import com.example.recipemealapi.ViewModel.SavingViewModel
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SavedScreen(savingViewModel: SavingViewModel, context: Context,mainNavigation: NavBackStack) {

    val savedDataList = savingViewModel.getAllDishesList.collectAsState(emptyList()).value


    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Fav/Saved",
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp,
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans))
                    )
                },
                colors = TopAppBarColors(
                    containerColor = CategoryScreen,
                    titleContentColor = TopAppBarTitleColor,
                    scrolledContainerColor = Gray,
                    navigationIconContentColor = Gray,
                    actionIconContentColor = Gray
                )
            )
        },
        containerColor = CategoryScreen,

        ) { innnerPadding ->

        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
                .padding(innnerPadding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {

            item {
                Text(
                    text = "Your Saved Dishes",
                    modifier = Modifier
                        .padding(13.dp),
                    fontSize = 25.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    fontWeight = FontWeight.Bold
                )
            }

            items(savedDataList) { listItems ->
                CategoryDetailsCard(
                    listItems.strMeal,
                    discription = "",
                    thumb = listItems.strMealThumb,

                ) {
//                    mainNavigation.add(MRoutes.FoodDetailsScreen(listItems.idMeal.toInt(), mealDisc = ",", mealName = listItems.meal))
                    mainNavigation.add(MRoutes.SavedFoodDetails(listItems))
                }

            }

        }

    }


}