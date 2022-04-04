package com.example.multicalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_frecuencia_max.*
import kotlinx.android.synthetic.main.activity_pantalla_imc.*

class FrecuenciaMax : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frecuencia_max)


        val mj=findViewById<Button>(R.id.btnMujer)
        val hb=findViewById<Button>(R.id.btnMen)


        mj.setOnClickListener {
            val intent=Intent(this, Mujer::class.java)
            startActivity(intent)
        }

        hb.setOnClickListener {
            val intent=Intent(this, PantallaHombre::class.java)
            startActivity(intent)
        }
    }
}