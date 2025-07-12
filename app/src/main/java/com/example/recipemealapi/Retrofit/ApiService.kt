package com.example.recipemealapi.Retrofit

import com.example.recipemealapi.DataModels.Category
import com.example.recipemealapi.DataModels.FoodDetails
import com.example.recipemealapi.DataModels.Meal
import com.example.recipemealapi.DataModels.Meals
import com.example.recipemealapi.DataModels.SearchingDIsh
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("categories.php")
    suspend fun catagorieslist(): retrofit2.Response<Category>


    @GET("filter.php")
    suspend fun mealsList(
        @Query("c") name: String
    ): Response<Meals>

    //    https://www.themealdb.com/api/json/v1/1/lookup.php?i=52772
    @GET("lookup.php")
    suspend fun PerDish(
        @Query("i") MealId: Int
    ): Response<FoodDetails>

    @GET("lookup.php")
    suspend fun SearchDishWord(
        @Query("s") mealName: String
    ): Response<SearchingDIsh>


//    @GET("lookup.php")
//    suspend fun SearchDishLetter(
//        @Query("s") mealName: Int
//    ): Response<FoodDetails>
}