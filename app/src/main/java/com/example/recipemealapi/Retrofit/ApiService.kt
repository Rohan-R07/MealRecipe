package com.example.recipemealapi.Retrofit

import com.example.recipemealapi.DataModels.Category
import retrofit2.http.GET


interface ApiService {

    @GET("categories.php")
    suspend fun catagorieslist(): retrofit2.Response<Category>

}