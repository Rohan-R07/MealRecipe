package com.example.recipemealapi.Retrofit

import com.example.recipemealapi.DataModels.Category
import com.example.recipemealapi.DataModels.Meal
import com.example.recipemealapi.DataModels.Meals
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("categories.php")
    suspend fun catagorieslist(): retrofit2.Response<Category>

    //    @GET("/search.php?s={name}")
//    suspend fun mealsList(@Path) : Response<Meals>
    @GET("filter.php")
    suspend fun mealsList(
        @Query("c") name: String
    ): Response<Meals>
}