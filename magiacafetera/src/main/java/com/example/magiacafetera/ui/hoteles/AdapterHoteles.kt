package com.example.magiacafetera.ui.hoteles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.CardViewHotelesBinding
import com.example.magiacafetera.model.DataHotelesItem


class AdapterHoteles(
    private val dataHoteles : ArrayList<DataHotelesItem>,
) : RecyclerView.Adapter<AdapterHoteles.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.card_view_hoteles,parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.render(dataHoteles[position])
    }

    override fun getItemCount(): Int = dataHoteles.size

    fun appendItems(newDataLugares: ArrayList<DataHotelesItem>) {
        dataHoteles.clear()
        dataHoteles.addAll(newDataLugares)
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val binding = CardViewHotelesBinding.bind(view)

        fun render(dataHoteles: DataHotelesItem) {
            binding.titleTextViewHoteles.text = dataHoteles.title
            binding.puntuacionRatingBarHoteles.rating = dataHoteles.puntuacion
        }
    }
}



