package com.example.recipemealapi.RoomDatabase

import android.app.Application
import androidx.room.Room

class SaveApplication: Application() {

    lateinit var db : SavingDatabase
        private set

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            applicationContext,
            SavingDatabase::class.java,
            "SavingDatabase.db"
        )

            .build()

    }

}