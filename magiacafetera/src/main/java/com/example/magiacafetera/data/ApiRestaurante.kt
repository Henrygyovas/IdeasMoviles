package com.example.magiacafetera.data

import com.example.magiacafetera.model.Restaurantes
import retrofit2.http.GET

interface ApiRestaurante {
    @GET("/Henrygyovas/IdeasMoviles/lugares")
    suspend fun  getRestaurantes() : List<Restaurantes>
}