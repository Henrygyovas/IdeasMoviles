package com.example.magiacafetera.data.datalugares

class DataLugaresRepository {
    suspend fun getDataLugares() = ApiFactory.retrofit.getLugares()
}