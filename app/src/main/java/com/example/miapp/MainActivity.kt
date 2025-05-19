package com.ejemplo.miapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.miapp.R
import com.example.miapp.ThirdActivity


class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MENSAJE = "mensaje_de_ida"
        const val EXTRA_RESPUESTA = "mensaje_de_vuelta"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonSegundaPantalla = findViewById<Button>(R.id.btnSegunda)
        val botonNavegador = findViewById<Button>(R.id.btnNavegador)
        val botonTerceraPantalla = findViewById<Button>(R.id.btnTercera)

        botonSegundaPantalla.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(EXTRA_MENSAJE, "¡Hola desde MainActivity!")
            startActivity(intent)
        }

        botonNavegador.setOnClickListener {
            val url = Uri.parse("https://www.tuuniversidad.edu") // Cambia la URL si quieres
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }

        botonTerceraPantalla.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}
