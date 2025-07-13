package com.example.recipemealapi.Screens.BottomNavScreens

import android.health.connect.datatypes.ExerciseCompletionGoal
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.recipemealapi.NavRoutes.BottomNavRoutes
import com.example.recipemealapi.R
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(viewModel: MealViewModel) {


    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = CategoryScreen,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Search Dishes",
                        fontSize = 24.sp,
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarColors(
                    containerColor = CategoryScreen,
                    scrolledContainerColor = CategoryScreen,
                    navigationIconContentColor = Unspecified,
                    titleContentColor = TopAppBarTitleColor,
                    actionIconContentColor = TopAppBarTitleColor
                )
            )
        }
    ) { innerPadding ->


        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val value = remember { mutableStateOf("") }
            TextField(
                value = value.value,
                onValueChange = { value.value = it }
            )

            viewModel.searchDishUsingWord(value.value)
            val details = viewModel.searchDishUsingWord.collectAsState()



            LazyColumn(

            ) {
                items(details.value) { item ->
                    Text(
                        text = item?.strMeal.toString()
                    )
                }
            }

        }
    }


}