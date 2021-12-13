package com.example.magiacafetera.data.dataRestaurantes

import com.example.magiacafetera.data.datalugares.ApiFactory

class DataRestaurantesRepository {
    suspend fun getDataRestaurantes() = ApiFactoryRestaurantes.retrofit.getRestaurantes()
}