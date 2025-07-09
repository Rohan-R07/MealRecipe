package com.example.recipemealapi.Screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.platform.LocalGraphicsContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import com.example.recipemealapi.Cards.CategoryDetailsCard
import com.example.recipemealapi.NavRoutes.MRoutes
import com.example.recipemealapi.R
import com.example.recipemealapi.Utils.ShimmerLoading
import com.example.recipemealapi.Utils.TypingText
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ui.theme.CSearch
import com.example.recipemealapi.ui.theme.CTextColor
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryDetailsScreen(
    viewModel: MealViewModel,
    topBarTitle: String = "Null",
    discroption: String = "Null",
    mainBackStack: NavBackStack
) {


    viewModel.getAllMeals(topBarTitle)

    val categoryDetaild = viewModel.allMeals.collectAsState(emptyList())

    val isLoading = viewModel.isLoadingCategoryS.collectAsState()
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = CategoryScreen,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = topBarTitle,
                        fontSize = 24.sp,
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarColors(
                    containerColor = CategoryScreen,
                    scrolledContainerColor = Gray,
                    navigationIconContentColor = CSearch,
                    titleContentColor = CTextColor,
                    actionIconContentColor = CSearch
                ),
                navigationIcon = {
                    IconButton(
                        onClick = {
                            mainBackStack.removeAll{true}
                            mainBackStack.add(MRoutes.MainScreen)
                        },
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .size(27.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            )
        }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            item {
                Text("Discription:", fontSize = 19.sp, modifier = Modifier.padding(13.dp))
                TypingText(
                    fullText = discroption,
                    textAligh = TextAlign.Start,
                    modifier = Modifier,
                    fontSize = 20.sp,
                )
            }

            item {
                Text(
                    text = "More on $topBarTitle",
                    fontSize = 25.sp,
                    color = TopAppBarTitleColor,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    modifier = Modifier
//                    .padding(innerPadding)
                        .padding(start = 20.dp, bottom = 12.dp),
                    fontWeight = FontWeight.ExtraBold
                )
            }

            if (isLoading.value) {
                items(categoryDetaild.value) { details ->
                    Column {


                        CategoryDetailsCard(
                            title = details.strMeal,
                            discription = details.idMeal,
                            thumb = details.strMealThumb
                        ) {
                                // TODO Detailed View of the corresponding dish
                            mainBackStack.add(
                                MRoutes.FoodDetailsScreen(
                                    details.idMeal.toInt()
                                )
                            )

                        }
                    }
                }
            } else {
                item {
                    ShimmerLoading(
                        manBoxModifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .width(358.dp)
                            .height(201.dp)
                    )
                    Spacer(Modifier.padding(top = 13.dp))
                    ShimmerLoading(
                        Modifier
                            .height(20.dp)
                            .fillMaxWidth()
                            .padding(10.dp)
                    )
                    Spacer(Modifier.padding(top = 10.dp))
                    ShimmerLoading(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 13.dp),
                    )
                }

            }

        }

    }
}