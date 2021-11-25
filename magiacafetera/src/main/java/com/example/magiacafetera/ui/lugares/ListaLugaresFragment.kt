package com.example.magiacafetera.ui.lugares

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.FragmentListaLugaresBinding
import com.google.gson.Gson

class ListaLugaresFragment : Fragment() {



    private lateinit var dataLugares: ArrayList<DataLugaresItem>
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<AdapterLugares.ViewHolder>? = null



    private var _binding: FragmentListaLugaresBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentListaLugaresBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataLugares = getLugaresFromJson()
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterLugares(dataLugares)
        }
    }

    private fun getLugaresFromJson(): ArrayList<DataLugaresItem> {
        val lugaresString : String = requireActivity().application.assets.open("lugares.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        val data = gson.fromJson(lugaresString, DataLugares::class.java)
        return data
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}