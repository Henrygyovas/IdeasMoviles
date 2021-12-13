package com.example.magiacafetera.ui.lugares

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.magiacafetera.data.datalugares.DataLugaresRepository
import com.example.magiacafetera.model.DataLugaresItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class ListaLugaresViewModel :  ViewModel() {

    private val dataLugaresLoad  = MutableLiveData<ArrayList<DataLugaresItem>>()
    val ondataLugaresLoaded : LiveData<ArrayList<DataLugaresItem>> = dataLugaresLoad

    private val repository = DataLugaresRepository()

    fun getDataLugaresFromServer(){
        GlobalScope.launch(Dispatchers.IO){
            dataLugaresLoad.postValue(repository.getDataLugares())
        }
    }

   /* fun getLugaresFromJson(dataLugaresJson: InputStream) {
        val dataLugaresString = dataLugaresJson.bufferedReader().use { it.readText() }
        val gson = Gson()
        dataLugaresLoad.value = gson.fromJson(dataLugaresString, DataLugares::class.java)
    } */
}