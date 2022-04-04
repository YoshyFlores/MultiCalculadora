package com.example.multicalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantalla_hombre.*

class PantallaHombre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_hombre)

        btnVol.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnShow.setOnClickListener {
            if(edtDat.text.isNotEmpty()){
                val dato=(edtDat.text.toString().toInt())
                val c=209

                val rf=calculate(dato,c)
                txtText.text=rf.toString()
            }
        }
    }

    private fun calculate(dato: Int, c: Int): Any {
        val dfr= dato.toFloat()*0.7
        val rf=(c.toFloat()-dfr)

        return "Su frecuencia cardíaca máxima es: "+rf

    }
}