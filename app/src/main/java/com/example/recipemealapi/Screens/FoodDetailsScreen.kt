package com.example.recipemealapi.Screens

import android.content.Context
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import coil.compose.AsyncImage
import com.example.recipemealapi.R
import com.example.recipemealapi.RoomDatabase.SaveEntity
import com.example.recipemealapi.Utils.Ingredient
import com.example.recipemealapi.Utils.InternetObserver
import com.example.recipemealapi.Utils.Measures
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ViewModel.SavingViewModel
import com.example.recipemealapi.ui.theme.CSearch
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor


@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodDetailsScreen(
    viewModels: MealViewModel, mealId: Int?,
    mainBackStack: NavBackStack,
    mealStr: String,
    mealDis: String,
    context: Context,
    savingViewModel: SavingViewModel
) {

//    val viewModels = viewModel<MealViewModel>()
    viewModels.getPerDetails(mealId, context)
    lateinit var internetObserver: InternetObserver


    internetObserver = InternetObserver(context) {
        // ✅ Internet is back: call API here

        viewModels.getPerDetails(mealId, context)

    }

    val onClickSaved = rememberSaveable {
        mutableStateOf(false)
    }
    val items = viewModels.perDishDetails.collectAsState().value

//    val savedState = savingViewModel.alreadySavedDishes()

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
//                            mainBackStack.add(MRoutes.CategoryDetailsScreen(mealStr,mealDis))
                            mainBackStack.removeLast()
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

                            onClickSaved.value = !onClickSaved.value
                            savingViewModel.saveDishes(
                                dishName = SaveEntity(
                                    dateModified = items?.dateModified.toString(),
                                    idMeal = items?.idMeal.toString(),
                                    strArea = items?.strArea.toString(),
                                    strCategory = items?.strCategory.toString(),
                                    strCreativeCommonsConfirmed = items?.strCreativeCommonsConfirmed.toString(),
                                    strImageSource = items?.strImageSource.toString(),
                                    strIngredient1 = items?.strIngredient1.toString(),
                                    strIngredient10 = items?.strIngredient10.toString(),
                                    strIngredient11 = items?.strIngredient11.toString(),
                                    strIngredient12 = items?.strIngredient12.toString(),
                                    strIngredient13 = items?.strIngredient13.toString(),
                                    strIngredient14 = items?.strIngredient14.toString(),
                                    strIngredient15 = items?.strIngredient15.toString(),
                                    strIngredient16 = items?.strIngredient16.toString(),
                                    strIngredient17 = items?.strIngredient17.toString(),
                                    strIngredient18 = items?.strIngredient18.toString(),
                                    strIngredient19 = items?.strIngredient19.toString(),
                                    strIngredient2 = items?.strIngredient2.toString(),
                                    strIngredient20 = items?.strIngredient20.toString(),
                                    strIngredient3 = items?.strIngredient3.toString(),
                                    strIngredient4 = items?.strIngredient4.toString(),
                                    strIngredient5 = items?.strIngredient5.toString(),
                                    strIngredient6 = items?.strIngredient6.toString(),
                                    strIngredient7 = items?.strIngredient7.toString(),
                                    strIngredient8 = items?.strIngredient8.toString(),
                                    strIngredient9 = items?.strIngredient9.toString(),
                                    strInstructions = items?.strInstructions.toString(),
                                    strMeal = items?.strMeal.toString(),
                                    strMealAlternate = items?.strMealAlternate.toString(),
                                    strMealThumb = items?.strMealThumb.toString(),
                                    strMeasure1 = items?.strMeasure1.toString(),
                                    strMeasure2 = items?.strMeasure2.toString(),
                                    strMeasure3 = items?.strMeasure3.toString(),
                                    strMeasure4 = items?.strMeasure4.toString(),
                                    strMeasure5 = items?.strMeasure5.toString(),
                                    strMeasure6 = items?.strMeasure6.toString(),
                                    strMeasure7 = items?.strMeasure7.toString(),
                                    strMeasure8 = items?.strMeasure8.toString(),
                                    strMeasure9 = items?.strMeasure9.toString(),
                                    strMeasure10 = items?.strMeasure10.toString(),
                                    strMeasure11 = items?.strMeasure11.toString(),
                                    strMeasure12 = items?.strMeasure12.toString(),
                                    strMeasure13 = items?.strMeasure13.toString(),
                                    strMeasure14 = items?.strMeasure14.toString(),
                                    strMeasure15 = items?.strMeasure15.toString(),
                                    strMeasure16 = items?.strMeasure16.toString(),
                                    strMeasure17 = items?.strMeasure17.toString(),
                                    strMeasure18 = items?.strMeasure18.toString(),
                                    strMeasure19 = items?.strMeasure19.toString(),
                                    strMeasure20 = items?.strMeasure20.toString(),
                                    strSource = items?.strSource.toString(),
                                    strTags = items?.strTags.toString(),
                                    strYoutube = items?.strYoutube.toString()
                                )
                            )
                        }
                    ) {
                        Icon(
                            painter = if (!onClickSaved.value) painterResource(R.drawable.save_per_details_screen) else painterResource(
                                R.drawable.saved_filled_
                            ),
                            contentDescription = null,
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }

                    if (onClickSaved.value) {
                        Toast.makeText(context, "Saved Sucessfully", Toast.LENGTH_SHORT).show()
                    }
                }
            )
        }

    ) { innerPadding ->


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
                        .padding(start = 14.dp, top = 3.dp, bottom = 3.dp),
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    fontSize = 24.sp,
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
                Spacer(Modifier.padding(3.dp))
            }

            item {

                Text(
                    text = "Measures",
                    modifier = Modifier
                        .padding(start = 14.dp, top = 3.dp, bottom = 3.dp),
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )


                Measures(
                    measures1 = items?.strMeasure1.toString(),
                    measures2 = items?.strMeasure2.toString(),
                    measures3 = items?.strMeasure3.toString(),
                    measures4 = items?.strMeasure4.toString(),
                    measures5 = items?.strMeasure5.toString(),
                    measures6 = items?.strMeasure6.toString(),
                    measures7 = items?.strMeasure7.toString(),
                    measures8 = items?.strMeasure8.toString(),
                    measures9 = items?.strMeasure9.toString(),
                    measures10 = items?.strMeasure10.toString(),
                    measures11 = items?.strMeasure11.toString(),
                    measures12 = items?.strMeasure12.toString(),
                    measures13 = items?.strMeasure13.toString(),
                    measures14 = items?.strMeasure14.toString(),
                    measures15 = items?.strMeasure15.toString(),
                    measures16 = items?.strMeasure16.toString(),
                    measures17 = items?.strMeasure17.toString(),
                    measures18 = items?.strMeasure18.toString(),
                    measures19 = items?.strMeasure19.toString(),
                    measures20 = items?.strMeasure20.toString(),
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

            item {
                Text(
                    text = "Instructions",
                    modifier = Modifier
                        .padding(start = 14.dp, top = 5.dp, bottom = 8.dp),
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )

                Text(
                    text = items?.strInstructions.toString(),
                    modifier = Modifier
                        .padding(start = 16.dp, top = 3.dp, bottom = 3.dp, end = 16.dp),
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )
            }

            item {
                val sampleText = "Hello world"
                items?.strMealAlternate.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
                    Text(
                        text = "Meal Alternative",
                        modifier = Modifier
                            .padding(start = 14.dp, top = 5.dp, bottom = 8.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = it,
                        modifier = Modifier
                            .padding(start = 16.dp, top = 3.dp, bottom = 3.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Start
                    )
                }
            }

            item {
                val sampleText = "Hello world"
                items?.strYoutube.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
                    Text(
                        text = "YouTube Tutorials",
                        modifier = Modifier
                            .padding(start = 14.dp, top = 10.dp, bottom = 8.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )

//                    Text(
//                        text = it,
//                        modifier = Modifier
//                            .padding(start = 16.dp, top = 3.dp, bottom = 3.dp),
//                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
//                        fontSize = 18.sp,
//                        fontWeight = FontWeight.Medium,
//                        textAlign = TextAlign.Start
//                    )
                    val uriHandler = LocalUriHandler.current
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .clickable {
                                uriHandler.openUri(it)
                            }
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(30.dp)),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                    ) {


                        Icon(
                            painter = painterResource(R.drawable.youtube_logo),
                            contentDescription = null,
                            tint = Unspecified,
                            modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp)
                                .size(55.dp)
                                .clip(RoundedCornerShape(30.dp)),

                            )

                        Text(
                            text = "Watch the Video",
                            color = TopAppBarTitleColor,
                            fontSize = 20.sp
                        )
                    }
                }
            }


            item {
                val sampleText = "Hello world"
                items?.strTags.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
                    Text(
                        text = "Tags #",
                        modifier = Modifier
                            .padding(start = 14.dp, top = 5.dp, bottom = 8.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = it,
                        modifier = Modifier
                            .padding(start = 16.dp, top = 3.dp, bottom = 3.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Start
                    )
                }
            }

            item {
                items?.strArea.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
                    Text(
                        text = "Area",
                        modifier = Modifier
                            .padding(start = 14.dp, top = 5.dp, bottom = 8.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = it,
                        modifier = Modifier
                            .padding(start = 16.dp, top = 3.dp, bottom = 3.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Start
                    )
                }
            }


            item {
                items?.strCategory.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
                    Text(
                        text = "Category",
                        modifier = Modifier
                            .padding(start = 14.dp, top = 5.dp, bottom = 8.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = it,
                        modifier = Modifier
                            .padding(start = 16.dp, top = 3.dp, bottom = 3.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Start
                    )
                }
            }

            item {
                items?.dateModified.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
                    Text(
                        text = "Date Modifier",
                        modifier = Modifier
                            .padding(start = 14.dp, top = 5.dp, bottom = 8.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = it,
                        modifier = Modifier
                            .padding(start = 16.dp, top = 3.dp, bottom = 3.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Start
                    )
                }
            }

            item {
                val sampleText = "Hello world"
                items?.strSource.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
                    Text(
                        text = "Source For Details",
                        modifier = Modifier
                            .padding(start = 14.dp, top = 10.dp, bottom = 8.dp),
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start
                    )

//                    Text(
//                        text = it,
//                        modifier = Modifier
//                            .padding(start = 16.dp, top = 3.dp, bottom = 3.dp),
//                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
//                        fontSize = 18.sp,
//                        fontWeight = FontWeight.Medium,
//                        textAlign = TextAlign.Start
//                    )
                    val uriHandler = LocalUriHandler.current
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .clickable {
                                uriHandler.openUri(it)
                            }
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(30.dp)),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                    ) {


                        Icon(
                            painter = painterResource(R.drawable.baseline_source_24),
                            contentDescription = null,
                            tint = Black,
                            modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp)
                                .size(55.dp)
                                .background(Unspecified)
                                .clip(RoundedCornerShape(30.dp)),


                            )

                        Text(
                            text = "Source",
                            color = TopAppBarTitleColor,
                            fontSize = 20.sp
                        )
                    }
                }
            }

        }
    }
}