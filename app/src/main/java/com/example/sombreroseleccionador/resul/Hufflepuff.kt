package com.example.sombreroseleccionador.resul

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sombreroseleccionador.MainActivity
import com.example.sombreroseleccionador.R
import com.example.sombreroseleccionador.databinding.ActivityHufflepuffBinding

class Hufflepuff : AppCompatActivity() {
    private lateinit var binding: ActivityHufflepuffBinding
    lateinit var musicHufflepuff: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        musicHufflepuff = MediaPlayer.create(this, R.raw.hufflepuff)
        musicHufflepuff.start()
       binding=ActivityHufflepuffBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            val intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}