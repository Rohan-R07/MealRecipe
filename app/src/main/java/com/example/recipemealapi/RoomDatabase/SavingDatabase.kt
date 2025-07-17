package com.example.recipemealapi.RoomDatabase

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [SaveEntity::class],
    version = 1,
    exportSchema = false
)
abstract class SavingDatabase : RoomDatabase(){

    abstract fun dao(): Dao


}