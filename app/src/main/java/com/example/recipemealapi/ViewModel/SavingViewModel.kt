package com.example.recipemealapi.ViewModel

import android.app.Application
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipemealapi.RoomDatabase.SaveApplication
import com.example.recipemealapi.RoomDatabase.SaveEntity
import kotlinx.coroutines.launch

class SavingViewModel(applicatin: Application): AndroidViewModel(applicatin) {


    private val db = (applicatin as SaveApplication).db.dao()

    val getAllDishesList = db.getAllSavedDishes()

//    fun alreadySavedDishes (id: Int) : SaveEntity?{
//
//     return db.getSavedDishById(id)
//    }

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

    fun deleteAllDishes(){
        viewModelScope.launch {
            db.deleteAllSavedDishes()
        }
    }
}