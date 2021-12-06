package com.example.magiacafetera.ui.restaurantes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.FragmentDetalleBinding
import com.example.magiacafetera.databinding.FragmentRestaurantesLugaresBinding
import com.example.magiacafetera.ui.lugares.detalles.DetalleFragmentArgs

class RestaurantesLugaresFragment : Fragment() {

    private var _binding: FragmentRestaurantesLugaresBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRestaurantesLugaresBinding.inflate(inflater, container, false)
        val root : View = binding.root
        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}