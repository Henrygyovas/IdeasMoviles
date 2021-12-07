package com.example.magiacafetera.data

class DataLugaresRepository {
    suspend fun getDataLugares() = ApiFactory.retrofit.getLugares()
}