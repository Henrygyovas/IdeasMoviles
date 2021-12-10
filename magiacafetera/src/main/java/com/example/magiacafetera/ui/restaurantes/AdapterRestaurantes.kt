package com.example.magiacafetera.ui.restaurantes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.CardViewRestaurantesBinding
import com.example.magiacafetera.model.DataRestaurantesItem

class AdapterRestaurantes(
    private val dataRestaurantes: ArrayList<DataRestaurantesItem>,
) : RecyclerView.Adapter<AdapterRestaurantes.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.card_view_restaurantes,parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.render(dataRestaurantes.get(position))
    }

    override fun getItemCount(): Int = dataRestaurantes.size

    fun appendItems(newDataLugares: ArrayList<DataRestaurantesItem>) {
        dataRestaurantes.clear()
        dataRestaurantes.addAll(newDataLugares)
        notifyDataSetChanged()
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val binding = CardViewRestaurantesBinding.bind(view)

        fun render(dataRestaurantes: DataRestaurantesItem) {
            binding.titleTextViewRestaurantes.text = dataRestaurantes.title
            binding.puntuacionRatingBarRestaurantes.rating = dataRestaurantes.puntuacion
        }
    }
}



