package com.example.magiacafetera.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataLugaresItem(
    @SerializedName("descripcion")
    val descripcion: String,
    @SerializedName("detalles")
    val detalles: String,
    @SerializedName("hacer")
    val hacer: String,
    @SerializedName("hoteles")
    val hoteles: List<Hoteles>,
    @SerializedName("image")
    val image: String,
    @SerializedName("latitud")
    val latitud: Double,
    @SerializedName("llegar")
    val llegar: String,
    @SerializedName("longitud")
    val longitud: Double,
    @SerializedName("puntuacion")
    val puntuacion: Float,
    @SerializedName("restaurantes")
    val restaurantes: List<Restaurantes>,
    @SerializedName("title")
    val title: String
) : Serializable