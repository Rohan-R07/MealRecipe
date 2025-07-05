package com.example.recipemealapi.Retrofit

import com.example.recipemealapi.Utils.isNetWorkAvaiable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroInstance {

//    https://www.themealdb.com/api/json/v1/1/categories.php

    val api by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}