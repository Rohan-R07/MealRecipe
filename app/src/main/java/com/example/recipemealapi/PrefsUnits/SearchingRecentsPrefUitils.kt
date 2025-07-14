package com.example.recipemealapi.PrefsUnits

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class SearchingRecentsPrefUitils(val context: Context) : ViewModel() {

    val Context.datastore by preferencesDataStore("RecentSearch")

    object PreferencesKeys {
        val RECENT_KEY = stringPreferencesKey("user_name")
    }

    suspend fun putRecent(DishName: String) {
        viewModelScope.launch {

            context.datastore.edit {
                it[PreferencesKeys.RECENT_KEY] = DishName
            }
        }
    }

    suspend fun getPrefData(): String {

        return context.datastore.data.map {
            it[PreferencesKeys.RECENT_KEY] ?: ""
        }.first()


    }

//    suspend fun getPrefDataList(): Flow<List<String>>{
//        return context.datastore.data
//            .map { preferences ->
//                preferences[PreferencesKeys.RECENT_KEY]?.toList() ?: emptyList()
//            }
//    }

    suspend fun getAllPrefsAsList(): List<String> {
        return context.datastore.data
            .map { preferences ->
                preferences.asMap().map { (key, value) ->
                    "${key.name}: $value"
                }
            }
            .first()
    }
}