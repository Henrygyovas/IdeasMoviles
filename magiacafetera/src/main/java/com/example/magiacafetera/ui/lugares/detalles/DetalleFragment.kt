package com.example.magiacafetera.ui.lugares.detalles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.magiacafetera.databinding.FragmentDetalleBinding
import com.squareup.picasso.Picasso


class DetalleFragment : Fragment() {


    private var _binding: FragmentDetalleBinding? = null
    private val binding get() = _binding!!
    private val args : DetalleFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDetalleBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataLugares = args.dataLugares

        with(binding) {
            titleTextView.text = dataLugares.title
            destallesTextView.text = dataLugares.detalles
            queHacerTextView.text = dataLugares.hacer
            comoLlegarTextView.text = dataLugares.llegar
            Picasso.get().load(dataLugares.image).into(rvImageView)

            textMapButton.setOnClickListener {
                findNavController().navigate(DetalleFragmentDirections.actionDetalleFragmentToMapsFragment(dataLugares2 = dataLugares))
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}