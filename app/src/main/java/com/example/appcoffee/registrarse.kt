package com.example.appcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class registrarse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        val btn_llevarAinicio : TextView = findViewById(R.id.btninicio_sesion)

        btn_llevarAinicio.setOnClickListener(){
            val x = Intent (this,login::class.java)
            startActivity(x)
        }
    }
}