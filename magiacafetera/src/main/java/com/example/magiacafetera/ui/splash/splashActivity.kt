package com.example.magiacafetera.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.navigation.ui.AppBarConfiguration
import com.example.magiacafetera.MainActivity
import com.example.magiacafetera.R
import com.example.magiacafetera.databinding.ActivityMainBinding
import com.example.magiacafetera.databinding.ActivitySplashBinding

class splashActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}