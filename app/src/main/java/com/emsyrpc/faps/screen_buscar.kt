package com.emsyrpc.faps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen_buscar.*

class screen_buscar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_buscar)

        //boton back - hacia menu principal
        val actionbar = supportActionBar
        actionbar!!.title = "Buscar Paciente"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        //Ir A Pantalla Mostrar y enviar info capturada

        btBuscar.setOnClickListener {
            val DNI:String = ingre_dni_editNumber.text.toString()
            val mostrar = screen_mostrar()
            val intent:Intent = Intent(this, screen_mostrar::class.java)
            mostrar.mostrar(DNI)
            startActivity(intent)

        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}