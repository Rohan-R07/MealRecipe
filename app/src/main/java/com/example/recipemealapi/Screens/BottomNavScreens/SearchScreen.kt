package com.example.recipemealapi.Screens.BottomNavScreens

import android.content.Context
import android.health.connect.datatypes.ExerciseCompletionGoal
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.NavBackStack
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.recipemealapi.Cards.SearchCard
import com.example.recipemealapi.NavRoutes.BottomNavRoutes
import com.example.recipemealapi.NavRoutes.MRoutes
import com.example.recipemealapi.PrefsUnits.SearchingRecentsPrefUitils
import com.example.recipemealapi.R
import com.example.recipemealapi.Utils.SearchTextField
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ui.theme.CTextColor
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(viewModel: MealViewModel, context: Context,mainBackStack: NavBackStack,indext:MutableState<Int>) {
    val focusRequester = remember { FocusRequester() }

    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }

    val preferenceDataStore = viewModel<SearchingRecentsPrefUitils>(
        factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return SearchingRecentsPrefUitils(context = context) as T
            }
        }

    )

    val couritineScope = rememberCoroutineScope()
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
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {


            val value = remember { mutableStateOf("") }
//            LaunchedEffect(Unit) {
//
//                preferenceDataStore.putRecent(value.value)
//            }
            SearchTextField(
                textValue = value, modifier = Modifier.focusRequester(focusRequester)
                ,
                perLetterTyped = {

                    viewModel.searchDishUsingWord(value.value)

                Text(
                    text = "Search Results",
                    modifier = Modifier
                        .padding(start = 13.dp, ),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    color = CTextColor
                )
                }
            )


            val details = viewModel.searchDishUsingWord.collectAsState()

            if (!details.value.isEmpty() && value.value.isEmpty()) {

                Text(
                    text = "Dishes Related to Previous Searches",
                    modifier = Modifier
                        .padding(start = 13.dp, bottom = 3.dp),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    color = CTextColor
                )

            }
            Log.d("Lising", details.value.isEmpty().toString())

            LazyColumn(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                items(details.value) { item ->
                    Spacer(Modifier.padding(10.dp))
                    SearchCard(
                        item?.strMeal.toString(),
                        item?.strArea.toString(),
                        item?.strMealThumb.toString()
                    ){
                        indext.value = 1
                        mainBackStack.add(
                            MRoutes.FoodDetailsScreen(
                                mealId = item?.idMeal?.toInt() ,item?.strMeal.toString(), mealDisc ="" ))

                    }
                }
            }

        }
    }


}