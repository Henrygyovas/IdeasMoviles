package com.example.magiacafetera.ui.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Restaurante(
    @SerializedName("puntuacion")
    val puntuacion: Double,
    @SerializedName("title")
    val title: String
) : Serializable