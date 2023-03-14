package com.example.sombreroseleccionador.resul

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sombreroseleccionador.MainActivity
import com.example.sombreroseleccionador.R
import com.example.sombreroseleccionador.databinding.ActivitySlytherynBinding

class Slytheryn : AppCompatActivity() {
    private lateinit var binding: ActivitySlytherynBinding
    lateinit var musicSlytherin: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        musicSlytherin = MediaPlayer.create(this, R.raw.slytherin)
        musicSlytherin.start()
        binding= ActivitySlytherynBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener {
            val intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}