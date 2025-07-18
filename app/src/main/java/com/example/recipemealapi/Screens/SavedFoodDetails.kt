package com.example.recipemealapi.Screens

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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
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
import com.example.recipemealapi.ui.theme.CSearch
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SavedFoodDetails(entity: SaveEntity,mainBackStact: NavBackStack) {


    val onClickSaved = rememberSaveable {
        mutableStateOf(false)
    }
    
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
                            mainBackStact.removeLast()
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
                    model = entity.strMealThumb.toString(),
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
                    text = entity.strMeal.toString(),
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
                    ingridient1 = entity.strIngredient1.toString(),
                    ingridient2 = entity.strIngredient2.toString(),
                    ingridient3 = entity.strIngredient3.toString(),
                    ingridient4 = entity.strIngredient4.toString(),
                    ingridient5 = entity.strIngredient5.toString(),
                    ingridient6 = entity.strIngredient6.toString(),
                    ingridient7 = entity.strIngredient7.toString(),
                    ingridient8 = entity.strIngredient8.toString(),
                    ingridient9 = entity.strIngredient9.toString(),
                    ingridient10 = entity.strIngredient10.toString(),
                    ingridient11 = entity.strIngredient11.toString(),
                    ingridient12 = entity.strIngredient12.toString(),
                    ingridient13 = entity.strIngredient13.toString(),
                    ingridient14 = entity.strIngredient14.toString(),
                    ingridient15 = entity.strIngredient15.toString(),
                    ingridient16 = entity.strIngredient16.toString(),
                    ingridient17 = entity.strIngredient17.toString(),
                    ingridient18 = entity.strIngredient18.toString(),
                    ingridient19 = entity.strIngredient19.toString(),
                    ingridient20 = entity.strIngredient20.toString()
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
                    measures1 = entity.strMeasure1.toString(),
                    measures2 = entity.strMeasure2.toString(),
                    measures3 = entity.strMeasure3.toString(),
                    measures4 = entity.strMeasure4.toString(),
                    measures5 = entity.strMeasure5.toString(),
                    measures6 = entity.strMeasure6.toString(),
                    measures7 = entity.strMeasure7.toString(),
                    measures8 = entity.strMeasure8.toString(),
                    measures9 = entity.strMeasure9.toString(),
                    measures10 =entity.strMeasure10.toString(),
                    measures11 =entity.strMeasure11.toString(),
                    measures12 =entity.strMeasure12.toString(),
                    measures13 =entity.strMeasure13.toString(),
                    measures14 =entity.strMeasure14.toString(),
                    measures15 =entity.strMeasure15.toString(),
                    measures16 =entity.strMeasure16.toString(),
                    measures17 =entity.strMeasure17.toString(),
                    measures18 =entity.strMeasure18.toString(),
                    measures19 =entity.strMeasure19.toString(),
                    measures20 =entity.strMeasure20.toString(),
                    ingridient1 = entity.strIngredient1.toString(),
                    ingridient2 = entity.strIngredient2.toString(),
                    ingridient3 = entity.strIngredient3.toString(),
                    ingridient4 = entity.strIngredient4.toString(),
                    ingridient5 = entity.strIngredient5.toString(),
                    ingridient6 = entity.strIngredient6.toString(),
                    ingridient7 = entity.strIngredient7.toString(),
                    ingridient8 = entity.strIngredient8.toString(),
                    ingridient9 = entity.strIngredient9.toString(),
                    ingridient10 = entity.strIngredient10.toString(),
                    ingridient11 = entity.strIngredient11.toString(),
                    ingridient12 = entity.strIngredient12.toString(),
                    ingridient13 = entity.strIngredient13.toString(),
                    ingridient14 = entity.strIngredient14.toString(),
                    ingridient15 = entity.strIngredient15.toString(),
                    ingridient16 = entity.strIngredient16.toString(),
                    ingridient17 = entity.strIngredient17.toString(),
                    ingridient18 = entity.strIngredient18.toString(),
                    ingridient19 = entity.strIngredient19.toString(),
                    ingridient20 = entity.strIngredient20.toString()
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
                    text = entity.strInstructions.toString(),
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
                entity.strMealAlternate.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
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
                entity.strYoutube.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
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
                entity.strTags.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
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
                entity.strArea.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
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
                entity.strCategory.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
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
                entity.dateModified.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
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
                entity.strSource.toString().takeIf { it.isNotBlank() && it != "null" }?.let {
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