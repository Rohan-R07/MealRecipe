package com.example.recipemealapi.Screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalGraphicsContext
import com.example.recipemealapi.ViewModel.MealViewModel

@Composable
fun CategoryDetailsScreen(viewModel: MealViewModel) {

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//    ) {
//        val categoryDetald = viewModel.getAllMeals("Breakf ast")
//
//        val categoryDetaild = viewModel.allMeals.collectAsState(emptyList())
//
//        LazyColumn {
//            items(categoryDetaild.value) { ii ->
//                Log.d("meal",ii.strMeal)
//            }
//        }
//
//    }



}