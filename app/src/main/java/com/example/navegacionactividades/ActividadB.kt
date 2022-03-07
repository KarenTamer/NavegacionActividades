package com.example.navegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActividadB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_b)

        val botonC = findViewById<Button>(R.id.botonC)
        val botonD = findViewById<Button>(R.id.botonD)

        botonC.setOnClickListener {
            var intent = Intent(this, ActividadC::class.java)
            startActivity(intent)
        }

        botonD.setOnClickListener {
            var intent = Intent(this, ActividadD::class.java)
            startActivity(intent)
        }
    }
}