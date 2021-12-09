package com.example.magiacafetera.ui.restaurantes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.magiacafetera.data.DataLugaresRepository
import com.example.magiacafetera.model.DataLugaresItem
import com.example.magiacafetera.model.DataRestaurantes
import com.example.magiacafetera.model.DataRestaurantesItem
import com.example.magiacafetera.model.Restaurantes
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.InputStream

class RestaurantesLugaresViewModel :  ViewModel() {

    private val dataRestaurantesLoad  = MutableLiveData<ArrayList<DataRestaurantesItem>>()
    val ondataRestaurantesLoaded : LiveData<ArrayList<DataRestaurantesItem>> = dataRestaurantesLoad

    fun getLugaresFromJson(dataRestaurantesJson: InputStream) {
        val dataRestaurantesString = dataRestaurantesJson.bufferedReader().use { it.readText() }
        val gson = Gson()
        dataRestaurantesLoad.value = gson.fromJson(dataRestaurantesString, DataRestaurantes::class.java)
    }
}