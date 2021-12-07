package com.example.magiacafetera.ui.lugares

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.databinding.FragmentListaLugaresBinding
import com.example.magiacafetera.model.DataLugaresItem

class ListaLugaresFragment : Fragment() {

    private var _binding: FragmentListaLugaresBinding? = null
    private val binding get() = _binding!!

    private val listaLugaresViewModel : ListaLugaresViewModel by viewModels()
    private var dataLugares: ArrayList<DataLugaresItem> = arrayListOf()
    private lateinit var adapterLugares: AdapterLugares
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<AdapterLugares.ViewHolder>? = null


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
       //listaLugaresViewModel.getLugaresFromJson(requireActivity().application.assets.open("lugares.json"))
        listaLugaresViewModel.getDataLugaresFromServer()

        listaLugaresViewModel.ondataLugaresLoaded.observe(viewLifecycleOwner,{ result ->
            onDataLugaresLoadedSubscribe(result)
        })

        adapterLugares = AdapterLugares(dataLugares, onItemClickListener = { onItemLugaresClick(it) })

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterLugares
            setHasFixedSize(false)
        }
    }

    private fun onDataLugaresLoadedSubscribe(result: ArrayList<DataLugaresItem>?) {
        result?.let { dataLugares ->
            adapterLugares.appendItems(dataLugares)
        }
    }

    private fun onItemLugaresClick(dataLugares: DataLugaresItem) {
        findNavController().navigate(ListaLugaresFragmentDirections.actionNavSitiosToDetalleFragment(dataLugares = dataLugares))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}