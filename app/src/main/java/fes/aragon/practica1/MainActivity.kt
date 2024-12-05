package fes.aragon.practica1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val entrada = findViewById<EditText>(R.id.entrada);

        val boton = findViewById<Button>(R.id.boton);

        boton.setOnClickListener {

            Log.i("TAG", "Se ha presionado el boton")

            val intent = Intent(this, MostrarActivity::class.java);

            intent.putExtra("entrada", entrada.text.toString())

            startActivity(intent);

        };
        
        entrada.doAfterTextChanged {

            boton.isEnabled = entrada.text.toString().isNotEmpty()

        }

    }
}