package com.example.navegacionactividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_c)

        val mensaje = intent.getStringExtra("MENSAJE")
        val mensajeDeA = intent.getStringExtra("MENSAJEA")
        val boton2 = findViewById<Button>(R.id.boton2)

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

        boton2.setOnClickListener {
            finish()
        }

    }
}