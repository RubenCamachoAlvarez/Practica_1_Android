package fes.aragon.practica1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MostrarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.mostrar_activity);

        val etiquetaDato = findViewById<TextView>(R.id.etiquetaDato);

        val datoRecibido = intent.getStringExtra("entrada")

        etiquetaDato.text = "Hola $datoRecibido!"

    }

}