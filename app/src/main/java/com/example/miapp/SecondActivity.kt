package com.ejemplo.miapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.miapp.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val mensajeRecibido = intent.getStringExtra(MainActivity.EXTRA_MENSAJE)
        val textViewMensaje = findViewById<TextView>(R.id.tvMensajeRecibido)
        val editTextRespuesta = findViewById<EditText>(R.id.etRespuesta)
        val botonEnviar = findViewById<Button>(R.id.btnEnviarDeVuelta)

        textViewMensaje.text = mensajeRecibido

        botonEnviar.setOnClickListener {
            val respuesta = editTextRespuesta.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(MainActivity.EXTRA_RESPUESTA, respuesta)
            startActivity(intent)
        }
    }
}
