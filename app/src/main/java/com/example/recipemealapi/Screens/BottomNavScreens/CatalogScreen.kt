package com.example.recipemealapi.Screens.BottomNavScreens

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import com.example.recipemealapi.Cards.CategoryCard
import com.example.recipemealapi.NavRoutes.BottomNavRoutes
import com.example.recipemealapi.NavRoutes.MRoutes
import com.example.recipemealapi.R
import com.example.recipemealapi.Utils.ShimmerLoading
import com.example.recipemealapi.ViewModel.MealViewModel
import com.example.recipemealapi.ui.theme.CSearch
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatalogScreen(viewModel: MealViewModel, bottomNavBackStack: NavBackStack, context: Context,mainBackStack: NavBackStack) {
    val categoryLists = viewModel.category.collectAsState()

    val isLoadings = viewModel.isLoadingCategoryS.collectAsState().value


    val gridState = rememberLazyGridState()
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Explore",
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarColors(
                    containerColor = CategoryScreen,
                    scrolledContainerColor = Gray,
                    navigationIconContentColor = Gray,
                    titleContentColor = TopAppBarTitleColor,
                    actionIconContentColor = Gray
                ),

            )
        },
        containerColor = CategoryScreen,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            Spacer(
                Modifier
//                    .padding(innerPadding)
                    .padding(4.dp)
            )

            Text(
                text = "Categories",
                fontSize = 25.sp,
                color = TopAppBarTitleColor,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                modifier = Modifier
//                    .padding(innerPadding)
                    .padding(start = 20.dp),
                fontWeight = FontWeight.ExtraBold
            )

            if (!isLoadings) {
                LazyVerticalGrid(
                contentPadding = innerPadding,
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .fillMaxSize(),
                    columns = GridCells.Fixed(2),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalArrangement = Arrangement.spacedBy(13.dp),
                    state = gridState,
                    flingBehavior = rememberSnapFlingBehavior(gridState),
                ) {
                    items(10) {
                        ShimmerLoading()
                        ShimmerLoading(
                            Modifier
                                .height(20.dp)
                                .width(
                                    150.dp
                                )
                        )
                        ShimmerLoading(
                            Modifier
                                .height(20.dp)
                                .width(
                                    150.dp
                                )
                        )
                    }
                }
                }else{

                Log.d("Boo",isLoadings.toString())
//

//            } else {
                Spacer(
                    Modifier
//                    .padding(innerPadding)
                        .padding(12.dp)
                )
                LazyVerticalGrid(
//                contentPadding = innerPadding,
                    modifier = Modifier
                        .padding(horizontal = 15.dp)
                        .fillMaxSize(),
                    columns = GridCells.Fixed(2),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalArrangement = Arrangement.spacedBy(13.dp),
                    state = gridState,
                    flingBehavior = rememberSnapFlingBehavior(gridState),
                ) {
                    // FOR TESTING PURPOSE
                    items(categoryLists.value) { items ->
                        CategoryCard(
                            thumb = items.strCategoryThumb,
                            context = context,
                            text = items.strCategory,
                            discription = items.strCategoryDescription
                        ){
                            mainBackStack.add(MRoutes.CategoryDetailsScreen(items.strCategory,items.strCategoryDescription))
                            Toast.makeText(context,items.strCategory, Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }
}
