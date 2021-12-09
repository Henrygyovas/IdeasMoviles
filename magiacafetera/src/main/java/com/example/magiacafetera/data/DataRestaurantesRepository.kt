package com.example.magiacafetera.data

class DataRestaurantesRepository {
    suspend fun getDataRestaurantes() = ApiFactoryRestaurate.retrofit.getRestaurantes()
}