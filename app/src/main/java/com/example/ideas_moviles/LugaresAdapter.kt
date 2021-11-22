package com.example.ideas_moviles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import java.util.ArrayList

class LugaresAdapter: RecyclerView.Adapter<LugaresAdapter.ViewHolder>() {

    val titles = arrayOf(
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
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_lugares, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.setText(titles[position])
        holder.itemDescripcion.setText(descripcion[position])
        holder.itemImagen.setImageResource(imagen[position])

    }

    override fun getItemCount(): Int {
        return titles.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var itemTitle: TextView
        var itemDescripcion: TextView
        var itemImagen: ImageView

        init {
            itemTitle = itemView.findViewById(R.id.title_text_view)
            itemDescripcion = itemView.findViewById(R.id.descripcion_text_view)
            itemImagen = itemView.findViewById(R.id.image_view)

        }
    }
}