package com.example.magiacafetera.ui.datosinteres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.ActivityDatosInteresBinding
import com.example.magiacafetera.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class DatosInteresActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDatosInteresBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_interes)

        binding = ActivityDatosInteresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val collectionAdapter = CollectionAdapter(this)
        val viewPager: ViewPager2 = findViewById(R.id.viewPager2)
        viewPager.adapter = collectionAdapter

        val tabs: TabLayout = findViewById(R.id.tabLayout)

        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getStringArray(R.array.tabs)[position]
        }.attach()

    }
}