package com.example.sombreroseleccionador.resul

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sombreroseleccionador.MainActivity
import com.example.sombreroseleccionador.R
import com.example.sombreroseleccionador.databinding.ActivityRavenclawBinding

class Ravenclaw : AppCompatActivity() {
    private lateinit var binding: ActivityRavenclawBinding
    lateinit var musicRavenclaw: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        musicRavenclaw = MediaPlayer.create(this, R.raw.ravenclaw)
        musicRavenclaw.start()
        binding= ActivityRavenclawBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button3.setOnClickListener {
            val intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}