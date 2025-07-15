package com.example.recipemealapi.RoomDatabase

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase


@Database(
    entities = [SavedEntity::class],
    version = 1
)
abstract class SavedDataBase : RoomDatabase() {

    abstract fun dao(): SavedDao

}