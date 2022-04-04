package com.example.multicalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_superficie_pantalla.*


class SuperficiePantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_superficie_pantalla)

        btnComeBack.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btncalcu.setOnClickListener {
            if (edtpeso.text.isNotEmpty() && edtaltura.text.isNotEmpty()) {
                val peso = (edtpeso.text.toString()).toInt()
                val altura = (edtaltura.text.toString()).toInt()

                val final = calculate(peso, altura)

                txtMas.text=final.toString()


            }
        }
    }

    private fun calculate(peso: Int, altura: Int): Any {
        val Final_pero= Math.pow(altura.toDouble(),0.725)
        val alt=Math.pow(peso.toDouble(),0.425)

        val resol= (0.718*Final_pero)*(alt)/100
        val number:Double = String.format("%.2f", resol).toDouble()

        return "Área de la superficie corporal: "+number+ "m^2"

    }
}

