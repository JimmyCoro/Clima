package com.example.clima
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class Clima : AppCompatActivity() {
    val valorRandom = Random.nextInt(51)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clima)
        val valorRandom = Random.nextInt(51)
        /*Estados :
            Soleado>30°
            10°<Nublado<20°
            Luvioso<10°
        */
        val btnAtras = findViewById<ImageView>(R.id.ivAtras)
        val tvCuidad = findViewById<TextView>(R.id.tvCuidad)
        val ivClima = findViewById<ImageView>(R.id.ivClima)
        val tvGrados = findViewById<TextView>(R.id.tvGrados)
        val tvClima = findViewById<TextView>(R.id.tvClima)
        val ivBandera = findViewById<ImageView>(R.id.ivBandera)

        var opt = intent.getIntExtra("opt",0)
        when(opt){
            1->{
                ivBandera.setImageResource(R.drawable.cuenca)
                tvCuidad.text = "Cuenca"
                tvGrados.text = valorRandom.toString()
                if (valorRandom>30){
                    ivClima.setImageResource(R.drawable.sol)
                    tvClima.text = "Soleado"
                }else if (10 < valorRandom && valorRandom < 29){
                    ivClima.setImageResource(R.drawable.dia_nublado)
                    tvClima.text = "Nublado"
                }else if (10>valorRandom){
                    ivClima.setImageResource(R.drawable.lluvia)
                    tvClima.text = "Lluvioso"
                }
            }
            2->{
                ivBandera.setImageResource(R.drawable.azoguez)
                tvCuidad.text = "Azoguez"
                tvGrados.text = valorRandom.toString()
                if (valorRandom>30){
                    ivClima.setImageResource(R.drawable.sol)
                    tvClima.text = "Soleado"
                }else if (10 < valorRandom && valorRandom < 29){
                    ivClima.setImageResource(R.drawable.dia_nublado)
                    tvClima.text = "Nublado"
                }else if (10>valorRandom){
                    ivClima.setImageResource(R.drawable.lluvia)
                    tvClima.text = "Lluvioso"
                }

            }
            3->{
                ivBandera.setImageResource(R.drawable.guayaquil)
                tvCuidad.text = "Guayaquil"
                tvGrados.text = valorRandom.toString()
                if (valorRandom>30){
                    ivClima.setImageResource(R.drawable.sol)
                    tvClima.text = "Soleado"
                }else if (10 < valorRandom && valorRandom < 29){
                    ivClima.setImageResource(R.drawable.dia_nublado)
                    tvClima.text = "Nublado"
                }else if (10>valorRandom){
                    ivClima.setImageResource(R.drawable.lluvia)
                    tvClima.text = "Lluvioso"
                }

            }
            4->{
                ivBandera.setImageResource(R.drawable.quito)

                tvCuidad.text = "Quito"
                tvGrados.text = valorRandom.toString()
                if (valorRandom>30){
                    ivClima.setImageResource(R.drawable.sol)
                    tvClima.text = "Soleado"
                }else if (10 < valorRandom && valorRandom < 29){
                    ivClima.setImageResource(R.drawable.dia_nublado)
                    tvClima.text = "Nublado"
                }else if (10>valorRandom){
                    ivClima.setImageResource(R.drawable.lluvia)
                    tvClima.text = "Lluvioso"
                }

            }
            5->{
                ivBandera.setImageResource(R.drawable.loja)
                tvCuidad.text = "Loja"
                tvGrados.text = valorRandom.toString()
                if (valorRandom>30){
                    ivClima.setImageResource(R.drawable.sol)
                    tvClima.text = "Soleado"
                }else if (10 < valorRandom && valorRandom < 29){
                    ivClima.setImageResource(R.drawable.dia_nublado)
                    tvClima.text = "Nublado"
                }else if (10>valorRandom){
                    ivClima.setImageResource(R.drawable.lluvia)
                    tvClima.text = "Lluvioso"
                }

            }
        }


        btnAtras.setOnClickListener {
            finish()
        }
    }
}