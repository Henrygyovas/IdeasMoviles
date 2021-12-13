package com.example.magiacafetera.data.dataHoteles

import com.example.magiacafetera.data.datalugares.ApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactoryHoteles {
    private const val urlApi = "https://my-json-server.typicode.com/"

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    val  retrofit : ApiServiceHoteles = Retrofit.Builder()
        .baseUrl(urlApi)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
        .run {
            create(ApiServiceHoteles::class.java)
        }
}