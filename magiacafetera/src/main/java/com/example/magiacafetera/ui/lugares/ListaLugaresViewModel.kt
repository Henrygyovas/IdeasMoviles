package com.example.magiacafetera.ui.lugares

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.magiacafetera.ui.model.DataLugares
import com.example.magiacafetera.ui.model.DataLugaresItem
import com.google.gson.Gson
import java.io.InputStream

class ListaLugaresViewModel :  ViewModel() {

    private val dataLugaresLoad  = MutableLiveData<ArrayList<DataLugaresItem>>()
    val ondataLugaresLoaded : LiveData<ArrayList<DataLugaresItem>> = dataLugaresLoad

    fun getLugaresFromJson(dataLugaresJson: InputStream) {
        val dataLugaresString = dataLugaresJson.bufferedReader().use { it.readText() }
        val gson = Gson()
        dataLugaresLoad.value = gson.fromJson(dataLugaresString, DataLugares::class.java)
    }
}