package com.example.magiacafetera.data.dataRestaurantes

import com.example.magiacafetera.model.DataRestaurantes
import retrofit2.http.GET

interface ApiServiceRestaurante {
    @GET("/Henrygyovas/IdeasMoviles/restaurantes")
    suspend fun getRestaurantes() : DataRestaurantes
}