package com.example.clima
import kotlin.random.Random
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val valorRandom = Random.nextInt(51)
        setContentView(R.layout.activity_main)

        val btnCuenca = findViewById<Button>(R.id.btnCuenca)
        val btnAzoguez = findViewById<Button>(R.id.btnAzoguez)
        val btnGuayaquil = findViewById<Button>(R.id.btnGuayaquil)
        val btnQuito = findViewById<Button>(R.id.btnQuito)
        val btnLoja = findViewById<Button>(R.id.btnLoja)

        val ventanaClima = Intent(this,Clima::class.java)
        var opcion = 0

        btnCuenca.setOnClickListener {
            opcion = 1
            ventanaClima.putExtra("opt",opcion)
            startActivity(ventanaClima)
        }

        btnAzoguez.setOnClickListener {
            opcion = 2
            ventanaClima.putExtra("opt",opcion)
            startActivity(ventanaClima)
        }

        btnGuayaquil.setOnClickListener {
            opcion = 3
            ventanaClima.putExtra("opt",opcion)
            startActivity(ventanaClima)
        }
        btnQuito.setOnClickListener {
            opcion = 4
            ventanaClima.putExtra("opt",opcion)
            startActivity(ventanaClima)
        }

        btnLoja.setOnClickListener {
            opcion = 5
            ventanaClima.putExtra("opt",opcion)
            startActivity(ventanaClima)
        }
    }
}