package com.example.magiacafetera.data

import com.example.magiacafetera.model.DataLugares
import retrofit2.http.GET

interface ApiService {
    @GET("/Henrygyovas/IdeasMoviles/lugares")
    suspend fun getLugares(): DataLugares
}