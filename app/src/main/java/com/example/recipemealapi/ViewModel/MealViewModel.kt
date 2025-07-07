package com.example.recipemealapi.ViewModel

import android.app.appsearch.GetByDocumentIdRequest
import retrofit2.HttpException
import android.util.Log
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipemealapi.DataModels.Category
import com.example.recipemealapi.DataModels.CategoryResopnce
import com.example.recipemealapi.DataModels.Meal
import com.example.recipemealapi.Retrofit.RetroInstance
import com.example.recipemealapi.Utils.isNetWorkAvaiable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MealViewModel : ViewModel() {

    private val _catgory = MutableStateFlow<List<CategoryResopnce>>(emptyList())
    val category = _catgory.asStateFlow()

    val isError = MutableLiveData<String>()
    val errorSate = isError

    val isLoading = MutableStateFlow<Boolean>(true)
    val isLsoading: StateFlow<Boolean> = isLoading


    val _allMeals = MutableStateFlow<List<Meal>>(emptyList())
    val allMeals = _allMeals.asStateFlow()

    init {

        getCategory()
        getAllMeals("Chicken")
    }

    fun getCategory() {

        try {
            isLoading.value = true
            viewModelScope.launch {
                val categoryData = RetroInstance.api.catagorieslist()
                if (categoryData.isSuccessful) {
                    val categoryList = categoryData.body()?.categories ?: emptyList()
                    isLoading.value = false
                    _catgory.value = categoryList
                } else {
                    Log.d("Error", "Unsucessfull")
                    isLoading.value = true
                }
            }
        } catch (e: Exception) {
            isLoading.value  = true
            e.printStackTrace()
        } catch (e: HttpException) {
            e.printStackTrace()
            errorSate.value = "is in error"
            Log.d("Erro", "It is an error getting data")
        }


    }

    fun getAllMeals(mealName: String) {
        try {
            viewModelScope.launch {
                val getAllMeal = RetroInstance.api.mealsList(mealName)
                if (getAllMeal.isSuccessful) {
                    val allMealList = getAllMeal.body()?.meals ?: emptyList()
                    _allMeals.value = allMealList
                } else {
                    Log.d("Error", "Unsucessfull")
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } catch (e: HttpException) {
            e.printStackTrace()
            errorSate.value = "is in error"
            Log.d("Erro", "It is an error getting data")
        }
    }

}