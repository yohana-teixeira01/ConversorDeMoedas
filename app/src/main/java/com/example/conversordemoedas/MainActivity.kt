package com.example.conversordemoedas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.conversordemoedas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDolar.setOnClickListener{
            escrever(1.06)
        }
        binding.buttonReal.setOnClickListener {
            escrever(5.47)
        }
        binding.buttonPeso.setOnClickListener {
            escrever(206.58)
        }
    }

    private fun escrever(taxa : Double){
        val euros = binding.editEuros.text.toString().trim()

        if(!euros.isEmpty()){
          val resultado = euros.toDouble() * taxa
          Toast.makeText(applicationContext,"${resultado}$",Toast.LENGTH_SHORT).show()
        }
    }
}