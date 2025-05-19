package com.example.miapp
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val botonEnviarCorreo = findViewById<Button>(R.id.btnEnviarCorreo)

        botonEnviarCorreo.setOnClickListener {
            enviarCorreoElectronico(
                arrayOf("ejemplo@correo.com"),
                "Asunto de prueba",
                "Este es el cuerpo del mensaje"
            )
        }
    }

    private fun enviarCorreoElectronico(destinatarios: Array<String>, asunto: String, cuerpo: String) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:") // Solo apps de correo deberían manejar esto
            putExtra(Intent.EXTRA_EMAIL, destinatarios)
            putExtra(Intent.EXTRA_SUBJECT, asunto)
            putExtra(Intent.EXTRA_TEXT, cuerpo)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}
git config --global user.name "Alexander"
git config --global user.email "johnalexs505@gmail.com"
