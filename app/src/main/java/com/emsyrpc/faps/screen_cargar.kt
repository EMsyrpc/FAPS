package com.emsyrpc.faps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_screen_cargar.*

class screen_cargar : AppCompatActivity() {
    private val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_cargar)

        //boton back - hacia menu principal
        val actionbar = supportActionBar
        actionbar!!.title = "Carga de Paciente"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        //llamada a funcion cargar pacientes
        cargarPaciente()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun cargarPaciente() {

        btGuardar.setOnClickListener {
            var dni = dniTextView.text.toString()
            db.collection("pacientes").document(dni).set(
                hashMapOf(
                    "apYnomb" to nombreTextView.text.toString(),
                    "fechaNac" to fechaTextView.text.toString(),
                    "telefono" to telefonoTextView.text.toString()
                )
            )
        }
    }
}