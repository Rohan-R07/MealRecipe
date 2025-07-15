package com.example.recipemealapi.RoomDatabase

import android.app.Application
import androidx.compose.ui.graphics.vector.RootGroupName
import androidx.room.Room

class mApplication: Application() {

    lateinit var dataBase: SavedDataBase
        private set

    override fun onCreate() {
        super.onCreate()
        dataBase = Room.databaseBuilder(
            applicationContext,
            SavedDataBase::class.java,
            "mDatabase"
        ).build()
    }

}