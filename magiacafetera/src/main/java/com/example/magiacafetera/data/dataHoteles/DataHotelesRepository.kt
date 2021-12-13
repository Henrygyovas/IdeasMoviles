package com.example.magiacafetera.data.dataHoteles

class DataHotelesRepository {
    suspend fun getDataHoteles() = ApiFactoryHoteles.retrofit.getHoteles()
}