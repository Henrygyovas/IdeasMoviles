package com.example.magiacafetera.ui.lugares


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataLugaresItem(
    @SerializedName("llegar")
    val llegar: String,
    @SerializedName("hacer")
    val hacer: String,
    @SerializedName("descripcion")
    val descripcion: String,
    @SerializedName("detalles")
    val detalles: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("title")
    val title: String
) : Serializable