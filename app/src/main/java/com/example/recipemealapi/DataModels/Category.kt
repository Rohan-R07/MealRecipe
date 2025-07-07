package com.example.recipemealapi.DataModels


data class Category(
    val categories: List<CategoryResopnce>,

)


data class CategoryResopnce(
    val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)

