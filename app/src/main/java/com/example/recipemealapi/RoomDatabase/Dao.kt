package com.example.recipemealapi.RoomDatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {

    @Insert
    suspend fun saveDishes(dish: SaveEntity)

    @Delete
    suspend fun deleteDish(dish: SaveEntity)

    @Query("SELECT * FROM SaveEntity ORDER BY id")
    fun getAllSavedDishes() : Flow<List<SaveEntity>>

    @Query("DELETE FROM SaveEntity")
    suspend fun deleteAllSavedDishes()


}