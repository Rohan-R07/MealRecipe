package com.example.recipemealapi.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipemealapi.RoomDatabase.SavedEntity
import com.example.recipemealapi.RoomDatabase.mApplication
import kotlinx.coroutines.launch

class RoomViewModel(application: Application) : AndroidViewModel(application) {

    private val db = (application as mApplication).dataBase.dao()

    val user = db.getData()

    fun saveDish(data: SavedEntity) {
        viewModelScope.launch {
            db.saveData(data)
        }
    }

    fun deleteDishes(data: SavedEntity) {
        viewModelScope.launch {
            db.deleteData(data)
        }
    }

    fun deleteAppDishes() {
        viewModelScope.launch {
            db.deleteAllData()
        }
    }

}