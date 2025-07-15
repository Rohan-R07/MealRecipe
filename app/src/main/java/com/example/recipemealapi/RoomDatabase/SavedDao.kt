package com.example.recipemealapi.RoomDatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface SavedDao {

    @Upsert
    suspend fun saveData(data: SavedEntity)

    @Delete
    suspend fun deleteData(data: SavedEntity)

    @Query("SELECT * FROM savedentity ORDER BY id ASC")
    fun getData() : Flow<List<SavedEntity>>

    @Query("DELETE FROM savedentity ")
    fun deleteAllData()
}