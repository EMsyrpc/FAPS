package com.emsyrpc.faps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_screen_mostrar.*

class screen_mostrar() : AppCompatActivity() {
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_mostrar)
        //boton back--toolbar
        val actionbar = supportActionBar
        actionbar!!.title = "Paciente"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    fun mostrar(dni:String){

        db.collection("pacientes").document(dni).get().addOnSuccessListener {
            mostr_nombre.setText(it.get("apYnomb") as String?)
            mostr_dni.setText(dni as String?)
            mostr_fecha.setText(it.get("fechaNac") as String?)
            mostr_telef.setText(it.get("telefono") as String?)
        }


    }
}