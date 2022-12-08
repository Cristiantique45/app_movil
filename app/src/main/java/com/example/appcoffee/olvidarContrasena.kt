package com.example.appcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class olvidarContrasena : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olvidar_contrasena)

        val volver_sesion : TextView = findViewById(R.id.btnvolverasesion)
        val volver_registrarse : TextView = findViewById(R.id.btnvolveraregistrarse)

        volver_sesion.setOnClickListener(){
            val a = Intent(this,login::class.java)
            startActivity(a)
        }

        volver_registrarse.setOnClickListener(){
            val r = Intent(this,registrarse::class.java)
            startActivity(r)
        }
    }
}