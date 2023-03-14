package com.example.sombreroseleccionador

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sombreroseleccionador.databinding.ActivityMainBinding
import com.example.sombreroseleccionador.resul.Gryffindor
import com.example.sombreroseleccionador.resul.Hufflepuff
import com.example.sombreroseleccionador.resul.Ravenclaw
import com.example.sombreroseleccionador.resul.Slytheryn

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var ost: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ost = MediaPlayer.create(this, R.raw.ost)
        ost.start()

        var gryffindor = 0
        var slytherin = 0
        var ravenclaw = 0
        var hufflepuff = 0
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn3.setOnClickListener {
            if (binding.radioButton.isChecked) {
                gryffindor++
            }
            if (binding.radioButton5.isChecked) {
                gryffindor++
            }
            if (binding.radioButton9.isChecked) {
                gryffindor++
            }
            if (binding.radioButton13.isChecked) {
                gryffindor++
            }
            if (binding.radioButton17.isChecked) {
                gryffindor++
            }

            if (binding.radioButton2.isChecked) {
                hufflepuff++
            }
            if (binding.radioButton6.isChecked) {
                hufflepuff++
            }
            if (binding.radioButton10.isChecked) {
                hufflepuff++
            }
            if (binding.radioButton14.isChecked) {
                hufflepuff++
            }
            if (binding.radioButton18.isChecked) {
                hufflepuff++
            }

            if (binding.radioButton3.isChecked) {
                slytherin++
            }
            if (binding.radioButton7.isChecked) {
                slytherin++
            }
            if (binding.radioButton11.isChecked) {
                slytherin++
            }
            if (binding.radioButton15.isChecked) {
                slytherin++
            }
            if (binding.radioButton19.isChecked) {
                slytherin++
            }

            if (binding.radioButton4.isChecked) {
                ravenclaw++
            }
            if (binding.radioButton8.isChecked) {
                ravenclaw++
            }
            if (binding.radioButton12.isChecked) {
                ravenclaw++
            }
            if (binding.radioButton16.isChecked) {
                ravenclaw++
            }
            if (binding.radioButton20.isChecked) {
                ravenclaw++
            }
            if (gryffindor > slytherin && gryffindor > hufflepuff && gryffindor > ravenclaw) {
                // ventana gryffindor
                Toast.makeText(this, "gryffindor", Toast.LENGTH_SHORT).show()
                ost.stop()
                val intent = Intent(this, Gryffindor::class.java)
                startActivity(intent)
                finish()
            } else if (slytherin > gryffindor && slytherin > hufflepuff && slytherin > ravenclaw) {
                Toast.makeText(this, "slytheryn", Toast.LENGTH_SHORT).show()
                ost.stop()
                val intent = Intent(this, Slytheryn::class.java)
                startActivity(intent)
                finish()
            } else if (hufflepuff > slytherin && hufflepuff > gryffindor && hufflepuff > ravenclaw) {
                Toast.makeText(this, "hufflepuff", Toast.LENGTH_SHORT).show()
                ost.stop()
                val intent = Intent(this, Hufflepuff::class.java)
                startActivity(intent)
                finish()
            } else if (ravenclaw > slytherin && ravenclaw > gryffindor && ravenclaw > hufflepuff) {
                Toast.makeText(this, "ravenclaw", Toast.LENGTH_SHORT).show()
                ost.stop()
                val intent = Intent(this, Ravenclaw::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "hacstol", Toast.LENGTH_SHORT).show()
            }
            gryffindor = 0
            slytherin = 0
            hufflepuff = 0
            ravenclaw = 0
        }
    }
}