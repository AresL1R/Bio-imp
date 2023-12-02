package com.ezatpanah.biometricauthentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ezatpanah.lotty.databinding.ActivityMainBinding

class `Sub act` : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            binding.ltAnimation.playAnimation()
        }

        binding.btnStop.setOnClickListener {
            binding.ltAnimation.pauseAnimation()

        }

    }
}