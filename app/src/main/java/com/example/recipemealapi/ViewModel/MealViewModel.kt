package com.example.recipemealapi.ViewModel

import android.app.appsearch.GetByDocumentIdRequest
import retrofit2.HttpException
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipemealapi.DataModels.Category
import com.example.recipemealapi.DataModels.CategoryResopnce
import com.example.recipemealapi.Retrofit.RetroInstance
import com.example.recipemealapi.Utils.isNetWorkAvaiable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MealViewModel : ViewModel() {

    private val _catgory = MutableStateFlow<List<CategoryResopnce>>(emptyList())
    val category = _catgory.asStateFlow()

    val isError = MutableLiveData<String>()
    val errorSate = isError

    init {

        getCategory()
    }

    fun getCategory() {

        try {
            viewModelScope.launch {
                val categoryData = RetroInstance.api.catagorieslist()
                if (categoryData.isSuccessful) {

                    val categoryList = categoryData.body()?.categories ?: emptyList()

                    _catgory.value = categoryList
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