package com.example.recipemealapi.ViewModel

import retrofit2.HttpException
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipemealapi.DataModels.CategoryResopnce
import com.example.recipemealapi.DataModels.Meal
import com.example.recipemealapi.DataModels.PerMeals
import com.example.recipemealapi.Retrofit.RetroInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MealViewModel : ViewModel() {

    private val _catgory = MutableStateFlow<List<CategoryResopnce>>(emptyList())
    val category = _catgory.asStateFlow()

    val isError = MutableLiveData<String>()
    val errorSate = isError

    val _isLoadingCatagoryS = MutableStateFlow<Boolean>(true)
    val isLoadingCategoryS: StateFlow<Boolean> = _isLoadingCatagoryS


    val _allMeals = MutableStateFlow<List<Meal>>(emptyList())
    val allMeals = _allMeals.asStateFlow()

    val _isLoadingCatDetailsS = MutableStateFlow<Boolean>(false)
    val isLoadingCatDetailsS: StateFlow<Boolean> = _isLoadingCatDetailsS
    
    val _perDishDetails = MutableStateFlow<PerMeals?>(
        PerMeals(
            dateModified = "0000",
            idMeal = "no id",
            strArea = "<<<",
            strCategory = "<<<>>>",
            strCreativeCommonsConfirmed = "<<<<>>>",
            strImageSource = "https:\\/\\/www.themealdb.com\\/images\\/media\\/meals\\/wvpsxx1468256321.jpg",
            strIngredient1 = "NO",
            strIngredient10 = "NO",
            strIngredient11 = "NO",
            strIngredient12 = "NO",
            strIngredient13 = "NO",
            strIngredient14 = "NO",
            strIngredient15 = "NO",
            strIngredient16 = "NO",
            strIngredient17 = "NO",
            strIngredient18 = "NO",
            strIngredient19 = "NO",
            strIngredient2 = "NO",
            strIngredient20 = "NO",
            strIngredient3 = "NO",
            strIngredient4 = "NO",
            strIngredient5 = "NO",
            strIngredient6 = "NO",
            strIngredient7 = "NO",
            strIngredient8 = "NO",
            strIngredient9 = "NO",
            strInstructions ="NO",
            strMeal = "NO",
            strMealAlternate = "NO",
            strMealThumb = "NO",
            strMeasure1 = "NO",
            strMeasure10 = "NO",
            strMeasure11 = "NO",
            strMeasure12 = "NO",
            strMeasure13 = "NO",
            strMeasure14 = "NO",
            strMeasure15 = "NO",
            strMeasure16 = "NO",
            strMeasure17 = "NO",
            strMeasure18 = "NO",
            strMeasure19 = "NO",
            strMeasure2 = "NO",
            strMeasure20 = "NO",
            strMeasure3 = "NO",
            strMeasure4 = "NO",
            strMeasure5 = "NO",
            strMeasure6 = "NO",
            strMeasure7 = "NO",
            strMeasure8 = "NO",
            strMeasure9 = "NO",
            strSource = "NO",
            strTags = "NO",
            strYoutube = "NO"
        )
    )
    val perDishDetails = _perDishDetails
    init {

        getCategory()
    }

    fun getCategory() {

        try {
            _isLoadingCatagoryS.value = !_isLoadingCatagoryS.value
            viewModelScope.launch {
                val categoryData = RetroInstance.api.catagorieslist()
                if (categoryData.isSuccessful) {
                    val categoryList = categoryData.body()?.categories ?: emptyList()
                    _isLoadingCatagoryS.value = !_isLoadingCatagoryS.value
                    _catgory.value = categoryList
                } else {
                    Log.d("Error", "Unsucessfull")
//                    _isLoadingCatagoryS.value = true
                }
            }
        } catch (e: Exception) {
            _isLoadingCatagoryS.value = !_isLoadingCatagoryS.value
            e.printStackTrace()
        } catch (e: HttpException) {
            e.printStackTrace()
            errorSate.value = "is in error"
            Log.d("Erro", "It is an error getting data")
        }


    }

    fun getAllMeals(mealName: String) {
        try {
            _isLoadingCatagoryS.value = true
            viewModelScope.launch {
                val getAllMeal = RetroInstance.api.mealsList(mealName)
                if (getAllMeal.isSuccessful) {
                    val allMealList = getAllMeal.body()?.meals ?: emptyList()
                    _allMeals.value = allMealList
                    _isLoadingCatDetailsS.value = false
                } else {
                    _isLoadingCatDetailsS.value = true

                    Log.d("Error", "Unsucessfull")
                }
            }
        } catch (e: Exception) {
            _isLoadingCatDetailsS.value = true
            e.printStackTrace()
        } catch (e: HttpException) {
            e.printStackTrace()
            errorSate.value = "is in error"
            Log.d("Erro", "It is an error getting data")
        }
    }
    
    fun getPerDetails(mealId: Int){
        viewModelScope.launch { 
            val result = RetroInstance.api.PerDish(mealId)
            if (result.isSuccessful){
                perDishDetails.value = result.body()?.meals?.firstOrNull()
                
            }
        }
    }

}