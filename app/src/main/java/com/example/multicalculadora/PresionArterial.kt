package com.example.multicalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_presion_arterial.*

class PresionArterial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presion_arterial)

        btnCome.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnCalculando.setOnClickListener {
            if (edtIng.text.isNotEmpty()) {

                val dato = (edtIng.text.toString().toInt())

                if (dato >= 14 && dato<18) {
                    txtResultados.text = "Rango de presión arterial superior: 90-120\n" +
                            "Rango de presión arterial más bajo: 50-80"
                }else if (dato>=19 && dato<40){
                    txtResultados.text="Rango de presión arterial superior: 95-135\n" +
                            "Rango de presión arterial más bajo: 60-80"

                }else if (dato>=41 &&dato<60){
                    txtResultados.text="Rango de presión arterial superior: 110-145\n" +
                            "Rango de presión arterial más bajo: 70–90"
                }else if (dato>=61){
                    txtResultados.text="Rango de presión arterial superior: 95-145\n" +
                            "rango de presión arterial más bajo: 70–90"
                }
            }
        }
    }
}