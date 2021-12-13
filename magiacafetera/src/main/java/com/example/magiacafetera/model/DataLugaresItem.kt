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
    @SerializedName("image")
    val image: String,
    @SerializedName("latitud")
    val latitud: Double,
    @SerializedName("llegar")
    val llegar: String,
    @SerializedName("longitud")
    val longitud: Double,
    @SerializedName("puntuacion")
    val puntuacion: Double,
    @SerializedName("title")
    val title: String
) : Serializable