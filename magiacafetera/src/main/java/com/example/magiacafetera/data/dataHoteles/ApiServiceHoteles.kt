package com.example.magiacafetera.data.dataHoteles

import com.example.magiacafetera.model.DataHoteles
import retrofit2.http.GET

interface ApiServiceHoteles {
    @GET("/Henrygyovas/IdeasMoviles/hoteles")
    suspend fun getHoteles() : DataHoteles
}