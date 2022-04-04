package com.example.multicalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pantalla_imc.*

class PantallaIMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_imc)

        btnVolver.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java )
            startActivity(intent)
        }
        calculate_btn.setOnClickListener {
            if (etHeight.text.isNotEmpty() && etWeight.text.isNotEmpty()) {
                val height = (etHeight.text.toString()).toInt()
                val weight = (etWeight.text.toString()).toInt()

                // calculateBMI retornara el IMC
                val IMC = calculateBMI(height, weight)

                bmi.text = IMC.toString()


                // Establecemos condiciones para la clasificación del BMI
                if (IMC < 18.5) {
                    status.text = "Bajo peso"
                } else if (IMC >= 18.5 && IMC < 24.9) {
                    status.text = "Saludable"
                } else if (IMC >= 24.9 && IMC < 30) {
                    status.text = "Exceso de peso"
                } else if (IMC >= 30) {
                    status.text = "Obesidad"
                }

            }
            else {
                Toast.makeText(this, "Porfavor ingrese los datos correctos", Toast.LENGTH_SHORT)
                    .show()
            }

        }
    }

    private fun calculateBMI(height: Int, weight: Int): Double {

        val Height_in_metre = height.toFloat() / 100
        val IMC = weight.toFloat() / (Height_in_metre * Height_in_metre)

        val number:Double = String.format("%.1f", IMC).toDouble()

        return number
    }
}



