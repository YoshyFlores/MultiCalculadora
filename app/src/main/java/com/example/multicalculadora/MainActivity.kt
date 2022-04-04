package com.example.multicalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imc=findViewById<Button>(R.id.btnIMC)
        val fc=findViewById<Button>(R.id.btnFC)
        val parte=findViewById<Button>(R.id.btnPA)
        val sup=findViewById<Button>(R.id.btnSuper)


        imc.setOnClickListener {
            val intent=Intent(this,PantallaIMC::class.java )
            startActivity(intent)
        }

        fc.setOnClickListener {
            val intent=Intent(this, FrecuenciaMax::class.java)
            startActivity(intent)
        }

        parte.setOnClickListener {
            val intent=Intent(this, PresionArterial::class.java)
            startActivity(intent)
        }

        sup.setOnClickListener {
            val intent=Intent(this, SuperficiePantalla::class.java)
            startActivity(intent)
        }

    }

}