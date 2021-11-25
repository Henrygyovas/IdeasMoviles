package com.example.magiacafetera.ui.Lugares

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.FragmentGalleryBinding

class ListaLugaresFragment : Fragment() {

    val lugares: List<DataLugares> = listOf(
        DataLugares(R.string.salento, R.string.des_salento,R.string.parrafo_fourth ,R.drawable.salento),
        DataLugares(R.string.Valle_cocora, R.string.des_valle_cocora,R.string.parrafo_fourth ,R.drawable.valle_cocora),
        DataLugares(R.string.Santa_rosa, R.string.des_santa_rosa,R.string.parrafo_fourth ,R.drawable.santa_rosa),
        DataLugares(R.string.parque_nevados, R.string.des_parque_nacional,R.string.parrafo_fourth ,R.drawable.parque_nevados)
    )

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<AdapterLugares.ViewHolder>? = null



    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            binding.recyclerView.apply {

            layoutManager = LinearLayoutManager(context)
            adapter = AdapterLugares(lugares)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}