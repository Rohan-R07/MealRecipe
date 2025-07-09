package com.example.recipemealapi.Screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.recipemealapi.R
import com.example.recipemealapi.Utils.Ingredient
import com.example.recipemealapi.Utils.Measures
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ui.theme.CSearch
import com.example.recipemealapi.ui.theme.CategoryScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodDetailsScreen(viewModels: MealViewModel, mealId: Int) {

    val viewModels = viewModel<MealViewModel>()
    viewModels.getPerDetails(mealId)
    val items = viewModels.perDishDetails.collectAsState().value


    Scaffold(
        modifier = Modifier,
        containerColor = CategoryScreen,
        topBar = {
            CenterAlignedTopAppBar(
                title = {},
                colors = TopAppBarColors(
                    containerColor = CategoryScreen,
                    scrolledContainerColor = CategoryScreen,
                    navigationIconContentColor = CSearch,
                    titleContentColor = CSearch,
                    actionIconContentColor = CSearch
                ),
                navigationIcon = {
                    IconButton(
                        onClick = {
                            // TODO BACK BUTTOn
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            modifier = Modifier
                                .size(26.dp)
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = {
                            // TODO SAVE BUTTOn
                        }
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.save_per_details_screen),
                            contentDescription = null,
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
                }
            )
        }

    ) { innerPadding ->

//        viewModels.getPerDetails(52772)
//        val itme = viewModels.perDishDetails.collectAsState().value
//
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            item {
                AsyncImage(
                    model = items?.strMealThumb.toString(),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Red)
                        .height(280.dp),
                    contentScale = ContentScale.Crop

                )
            }

            item {
                Text(
                    text = items?.strMeal.toString(),
                    modifier = Modifier
                        .padding(14.dp),
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Start
                )

            }

            item {
                Text(
                    text = "Ingredients",
                    modifier = Modifier
                        .padding(start = 14.dp, top  = 3.dp,bottom = 3.dp),
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )


                Ingredient(
                    ingridient1 = items?.strIngredient1.toString(),
                    ingridient2 = items?.strIngredient2.toString(),
                    ingridient3 = items?.strIngredient3.toString(),
                    ingridient4 = items?.strIngredient4.toString(),
                    ingridient5 = items?.strIngredient5.toString(),
                    ingridient6 = items?.strIngredient6.toString(),
                    ingridient7 = items?.strIngredient7.toString(),
                    ingridient8 = items?.strIngredient8.toString(),
                    ingridient9 = items?.strIngredient9.toString(),
                    ingridient10 = items?.strIngredient10.toString(),
                    ingridient11 = items?.strIngredient11.toString(),
                    ingridient12 = items?.strIngredient12.toString(),
                    ingridient13 = items?.strIngredient13.toString(),
                    ingridient14 = items?.strIngredient14.toString(),
                    ingridient15 = items?.strIngredient15.toString(),
                    ingridient16 = items?.strIngredient16.toString(),
                    ingridient17 = items?.strIngredient17.toString(),
                    ingridient18 = items?.strIngredient18.toString(),
                    ingridient19 = items?.strIngredient19.toString(),
                    ingridient20 = items?.strIngredient20.toString()
                )
            }

//            item {
//                Measures(
//                    measure1 =items?.strMeasure1.toString(),
//                    measure2 =items?.strMeasure2.toString(),
//                    measure3 =items?.strMeasure3.toString(),
//                    measure4 =items?.strMeasure4.toString(),
//                    measure5 =items?.strMeasure5.toString(),
//                    measure6 =items?.strMeasure6.toString(),
//                    measure7 =items?.strMeasure7.toString(),
//                    measure8 =items?.strMeasure8.toString(),
//                    measure9 =items?.strMeasure9.toString(),
//                    measure10 = items?.strMeasure10.toString(),
//                    measure11 = items?.strMeasure11.toString(),
//                    measure12 = items?.strMeasure12.toString(),
//                    measure13 = items?.strMeasure13.toString(),
//                    measure14 = items?.strMeasure14.toString(),
//                    measure15 = items?.strMeasure15.toString(),
//                    measure16 = items?.strMeasure16.toString(),
//                    measure17 = items?.strMeasure17.toString(),
//                    measure18 = items?.strMeasure18.toString(),
//                    measure19 = items?.strMeasure19.toString(),
//                    measure20 = items?.strMeasure20.toString()
//                )
//            }
        }


    }


}