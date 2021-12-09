package com.example.magiacafetera.ui.datosinteres

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.magiacafetera.model.Hoteles
import com.example.magiacafetera.ui.hoteles.HotelesLugaresFragment
import com.example.magiacafetera.ui.recreacion.RecreacionFragment
import com.example.magiacafetera.ui.restaurantes.RestaurantesLugaresFragment

class CollectionAdapter(fm: FragmentActivity) :
    FragmentStateAdapter(fm) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RestaurantesLugaresFragment()
            1 -> HotelesLugaresFragment()
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
}