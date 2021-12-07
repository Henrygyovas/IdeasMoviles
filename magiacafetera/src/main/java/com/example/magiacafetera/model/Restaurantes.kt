package com.example.magiacafetera.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Restaurantes(
    @SerializedName("puntuacion")
    val puntuacion: Float,
    @SerializedName("title")
    val title: String
) : Serializable