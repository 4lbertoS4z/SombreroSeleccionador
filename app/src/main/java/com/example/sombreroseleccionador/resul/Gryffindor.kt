package com.example.sombreroseleccionador.resul

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sombreroseleccionador.MainActivity
import com.example.sombreroseleccionador.R
import com.example.sombreroseleccionador.databinding.ActivityGryffindorBinding

class Gryffindor : AppCompatActivity() {
    private lateinit var binding: ActivityGryffindorBinding
    lateinit var musicGryffindor: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        musicGryffindor = MediaPlayer.create(this, R.raw.gryffindor)
        musicGryffindor.start()
        binding = ActivityGryffindorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}