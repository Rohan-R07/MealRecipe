package com.example.recipemealapi.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.recipemealapi.RoomDatabase.SaveApplication
import com.example.recipemealapi.RoomDatabase.SaveEntity
import kotlinx.coroutines.launch

class SavingViewModel(applicatin: Application): AndroidViewModel(applicatin) {


    private val db = (applicatin as SaveApplication).db.dao()

    val user = db.getAllSavedDishes()

    fun saveDishes(dishName: SaveEntity){
        viewModelScope.launch {
            db.saveDishes(dishName)
        }
    }

    fun deleteDishes(dishName: SaveEntity){
        viewModelScope.launch {
            db.deleteDish(dishName)
        }
    }

    fun deleteAllDishes(dishName: SaveEntity){
        viewModelScope.launch {
            db.deleteAllSavedDishes()
        }
    }
}