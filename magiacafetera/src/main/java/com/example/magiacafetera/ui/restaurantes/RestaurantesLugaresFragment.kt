package com.example.magiacafetera.ui.restaurantes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.FragmentDetalleBinding
import com.example.magiacafetera.databinding.FragmentRestaurantesLugaresBinding
import com.example.magiacafetera.model.DataLugaresItem
import com.example.magiacafetera.model.DataRestaurantesItem
import com.example.magiacafetera.model.Restaurantes
import com.example.magiacafetera.ui.lugares.AdapterLugares
import com.example.magiacafetera.ui.lugares.ListaLugaresFragmentDirections
import com.example.magiacafetera.ui.lugares.ListaLugaresViewModel
import com.example.magiacafetera.ui.lugares.detalles.DetalleFragmentArgs

class RestaurantesLugaresFragment : Fragment() {

    private var _binding: FragmentRestaurantesLugaresBinding? = null
    private val binding get() = _binding!!

    private val RestaurantesLugaresViewModel : RestaurantesLugaresViewModel by viewModels()
    private var dataRestaurantes: ArrayList<DataRestaurantesItem> = arrayListOf()
    private lateinit var adapterRestaurantes: AdapterRestaurantes
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<AdapterRestaurantes.ViewHolder>? = null

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

        RestaurantesLugaresViewModel.getLugaresFromJson(requireActivity().application.assets.open("DataRestaurantes.json"))

        RestaurantesLugaresViewModel.ondataRestaurantesLoaded.observe(viewLifecycleOwner, {result ->
            onDataRestaurantesLoadedSubscribe(result)
        })

        adapterRestaurantes = AdapterRestaurantes(dataRestaurantes)

        binding.restaurantesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterRestaurantes
            setHasFixedSize(false)
        }
    
    }

    private fun onDataRestaurantesLoadedSubscribe(result: ArrayList<DataRestaurantesItem>?) {
        result?.let { dataRestaurantes ->
            adapterRestaurantes.appendItems(dataRestaurantes)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}