package com.example.magiacafetera.data.datalugares

import com.example.magiacafetera.model.DataLugares
import com.example.magiacafetera.model.DataRestaurantes
import retrofit2.http.GET

interface ApiService {
    @GET("/Henrygyovas/IdeasMoviles/lugares")
    suspend fun getLugares(): DataLugares
}