package com.example.appcoffee
import android.content.Intent
import android.net.wifi.p2p.WifiP2pManager.ActionListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuth.AuthStateListener
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class login : AppCompatActivity() {
    private lateinit var firebaseAuth : FirebaseAuth
    private lateinit var authStateListener : FirebaseAuth.AuthStateListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnsesion : Button = findViewById(R.id.btnsesion)
        val txtUsuario : EditText = findViewById(R.id.txtusuario)
        val txtContrasena : EditText = findViewById(R.id.txtcontrasena)
        firebaseAuth = Firebase.auth
        btnsesion.setOnClickListener()
        {
            singIn(txtUsuario.text.toString(), txtContrasena.text.toString())

        }
    }
    private fun singIn (email:String, password: String)
    {
        firebaseAuth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){ task ->
                if(task.isSuccessful){
                    val user = firebaseAuth.currentUser
                    Toast.makeText(baseContext, "Autenticacion Exitosa", Toast.LENGTH_SHORT).show()
                    //aqui se va a la pantalla principal
                    val i = Intent(this,pantallaPrincipal::class.java)
                    startActivity(i)
                }
                else{
                    Toast.makeText(baseContext, "Error de correo y/o contraseña", Toast.LENGTH_SHORT).show()
                }

        }
    }
}
