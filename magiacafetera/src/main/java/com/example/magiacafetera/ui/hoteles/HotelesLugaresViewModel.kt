package com.example.magiacafetera.ui.hoteles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.magiacafetera.data.dataHoteles.DataHotelesRepository
import com.example.magiacafetera.model.*
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.InputStream

class HotelesLugaresViewModel :  ViewModel() {

    private val dataHotelesLoad  = MutableLiveData<ArrayList<DataHotelesItem>>()
    val ondataHotelesLoaded : LiveData<ArrayList<DataHotelesItem>> = dataHotelesLoad

    private val repository = DataHotelesRepository()

    fun getDataHotelesFromServer(){
        GlobalScope.launch(Dispatchers.IO){
            dataHotelesLoad.postValue(repository.getDataHoteles())
        }
    }

     /*fun getLugaresFromJson(dataHotelesString : InputStream) {
        val dataHotelesString = dataHotelesString.bufferedReader().use { it.readText() }
        val gson = Gson()
        dataHotelesLoad.value = gson.fromJson(dataHotelesString, DataHoteles::class.java)
    } */
}