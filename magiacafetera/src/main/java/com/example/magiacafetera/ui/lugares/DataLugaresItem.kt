package com.example.magiacafetera.ui.lugares


import com.google.gson.annotations.SerializedName

data class DataLugaresItem(
    @SerializedName("descripcion")
    val descripcion: String,
    @SerializedName("detalles")
    val detalles: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("title")
    val title: String
)