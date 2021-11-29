package com.example.magiacafetera.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.magiacafetera.R

import com.example.magiacafetera.databinding.FragmentHomeTwoBinding
import com.squareup.picasso.Picasso


class HomeFragmentTwo : Fragment() {

    private var _binding: FragmentHomeTwoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeTwoBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Picasso.get().load("https://res.cloudinary.com/kvot/image/upload/v1638229042/foto_second_chvpfv.jpg").into(binding.fotoSecundaria)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}