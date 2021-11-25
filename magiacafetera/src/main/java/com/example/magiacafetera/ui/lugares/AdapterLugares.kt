package com.example.magiacafetera.ui.lugares

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.databinding.CardViewLugaresBinding
import com.squareup.picasso.Picasso

class AdapterLugares(val dataLugares: List<DataLugaresItem>): RecyclerView.Adapter<AdapterLugares.ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)

            return ViewHolder(layoutInflater.inflate(com.example.magiacafetera.R.layout.card_view_lugares, parent, false))
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.render(dataLugares[position])

        }

        override fun getItemCount(): Int = dataLugares.size

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view){


            val binding = CardViewLugaresBinding.bind(view)
            fun render(dataLugares: DataLugaresItem) {
                binding.titleTextView.text = dataLugares.title
                binding.descripcionTextView.text = (dataLugares.descripcion)
                Picasso.get().load(dataLugares.image).into(binding.rvImageView)
            }
        }


}


