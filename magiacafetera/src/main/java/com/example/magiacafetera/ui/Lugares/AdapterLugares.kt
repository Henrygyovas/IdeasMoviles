package com.example.magiacafetera.ui.Lugares

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.databinding.CardViewLugaresBinding

class AdapterLugares(val lugares: List<DataLugares>): RecyclerView.Adapter<AdapterLugares.ViewHolder>() {


        /*  val titles = arrayOf(
              R.string.salento,
              R.string.Valle_cocora,
              R.string.Santa_rosa,
              R.string.parque_nevados
          )

          val descripcion = arrayOf(
              R.string.des_salento,
              R.string.des_valle_cocora,
              R.string.des_santa_rosa,
              R.string.des_parque_nacional
          )

          val imagen = arrayOf(
              R.drawable.salento,
              R.drawable.valle_cocora,
              R.drawable.santa_rosa,
              R.drawable.parque_nevados
          ) */

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)

            return ViewHolder(layoutInflater.inflate(com.example.magiacafetera.R.layout.card_view_lugares, parent, false))
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.render(lugares[position])

        }

        override fun getItemCount(): Int = lugares.size


        class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
            /*var itemImagen: ImageView
            var itemTitle: TextView
            var itemDescripcion: TextView */


            /* init {
                 itemTitle = itemView.findViewById(R.id.title_text_view)
                 itemDescripcion = itemView.findViewById(R.id.descripcion_text_view)
                 itemImagen = itemView.findViewById(R.id.image_view)

             } */
            val binding = CardViewLugaresBinding.bind(view)
            fun render(lugares: DataLugares) {
                binding.titleTextView.setText(lugares.title)
                binding.descripcionTextView.setText(lugares.descripcion)
                binding.imageView.setImageResource(lugares.image)
            }
        }


}