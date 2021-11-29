package com.example.magiacafetera.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBindings
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.FragmentHomeBinding
import com.squareup.picasso.Picasso

class    HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_home_fragment_two)
        }

        Picasso.get().load("https://res.cloudinary.com/kvot/image/upload/v1638229032/foto_principal_j2kkt1.jpg").into(binding.fotoPrincipal)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}