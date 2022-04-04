package com.example.multicalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mujer.*

class Mujer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mujer)

        btnRetornar.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btncalculo.setOnClickListener {
            if (edtNumero.text.isNotEmpty()){

                val num=(edtNumero.text.toString()).toInt()
                val b=214

                val fr= calculatefr(num,b)
                txtMostrar.text= fr.toString()
            }
        }
    }

    private fun calculatefr(num: Int, b: Int): Any {
        val frResultado= num.toFloat()*0.8
        val fr= (b.toFloat()-frResultado)

        return "Su frecuencia cardiaca máxima es: "+fr

    }
}