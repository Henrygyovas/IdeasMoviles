package com.example.magiacafetera.ui.lugares

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.CardViewLugaresBinding
import com.example.magiacafetera.model.DataLugaresItem
import com.squareup.picasso.Picasso

class AdapterLugares(
    private val dataLugares: ArrayList<DataLugaresItem>,
    private val onItemClickListener: (DataLugaresItem) -> Unit,
) : RecyclerView.Adapter<AdapterLugares.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.card_view_lugares, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.render(dataLugares[position])

        holder.itemView.setOnClickListener { onItemClickListener(dataLugares[position]) }
    }

    override fun getItemCount(): Int = dataLugares.size

    fun appendItems(newDataLugares: ArrayList<DataLugaresItem>) {
        dataLugares.clear()
        dataLugares.addAll(newDataLugares)
        notifyDataSetChanged()
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = CardViewLugaresBinding.bind(view)
        fun render(dataLugares: DataLugaresItem) {

            binding.titleTextView.text = dataLugares.title
            binding.puntuacionRatingBar.rating = dataLugares.puntuacion.toFloat()
            binding.descripcionTextView.text = dataLugares.descripcion
            Picasso.get().load(dataLugares.image).into(binding.rvImageView)
        }
    }


}


