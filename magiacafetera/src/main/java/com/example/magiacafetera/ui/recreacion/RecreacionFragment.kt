package com.example.magiacafetera.ui.recreacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.FragmentRecreacionBinding
import com.example.magiacafetera.databinding.FragmentRestaurantesLugaresBinding

class RecreacionFragment : Fragment() {


    private var _binding: FragmentRecreacionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRecreacionBinding.inflate(inflater, container, false)
        val root : View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title: TextView = view.findViewById(R.id.subtitleTextView)
        title.text = resources.getStringArray(R.array.planets)[2]
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}