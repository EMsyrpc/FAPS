package com.emsyrpc.faps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_screen_buscar.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBuscar.setOnClickListener {

            val intent: Intent = Intent(this, screen_buscar::class.java)
            startActivity(intent)

        }
        btnCargar.setOnClickListener {

            val intent:Intent = Intent(this, screen_cargar::class.java)
            startActivity(intent)

        }


    }






}
