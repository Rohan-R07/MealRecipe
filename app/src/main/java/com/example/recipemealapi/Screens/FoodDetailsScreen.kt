package com.example.recipemealapi.Screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.recipemealapi.ViewModel.MealViewModel


@Composable
fun FoodDetailsScreen(viewModels: MealViewModel) {
//    val viewModels = viewModel<MealViewModel>()
    Scaffold(
        modifier = Modifier,
        topBar = {}

    ) { innerPadding ->

//        viewModels.getPerDetails(52772)
//        val itme = viewModels.perDishDetails.collectAsState().value

        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
//            Log.d("MealingS", itme?.strArea.toString())
        }


    }


}