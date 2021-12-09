package com.example.magiacafetera.ui.hoteles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.FragmentHotelesLugaresBinding
import com.example.magiacafetera.model.DataHotelesItem
import com.example.magiacafetera.model.DataRestaurantesItem
import com.example.magiacafetera.ui.restaurantes.AdapterRestaurantes
import com.example.magiacafetera.ui.restaurantes.RestaurantesLugaresViewModel


class HotelesLugaresFragment : Fragment() {

    private var _binding: FragmentHotelesLugaresBinding? = null
    private val binding get() = _binding!!

    private val HotelesLugaresViewModel : HotelesLugaresViewModel by viewModels()
    private var dataHoteles : ArrayList<DataHotelesItem> = arrayListOf()
    private lateinit var adapterHoteles: AdapterHoteles
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<AdapterHoteles.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHotelesLugaresBinding.inflate(inflater, container, false)
        val root : View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        HotelesLugaresViewModel.getLugaresFromJson(requireActivity().application.assets.open("DataHoteles.json"))

        HotelesLugaresViewModel.ondataHotelesLoaded.observe(viewLifecycleOwner, {result ->
            onDataHotelesLoadedSubscribe(result)
        })

        adapterHoteles = AdapterHoteles(dataHoteles)

        binding.hotelesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterHoteles
            setHasFixedSize(false)
        }

    }

    private fun onDataHotelesLoadedSubscribe(result: ArrayList<DataHotelesItem>?) {
        result?.let { dataHoteles ->
            adapterHoteles.appendItems(dataHoteles)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}