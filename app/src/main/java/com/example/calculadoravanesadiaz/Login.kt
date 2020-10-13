package com.example.calculadoravanesadiaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }

    fun acceder(view: View) {
        var editTextUsr = findViewById<EditText>(R.id.editTextTextUsr)
        var editTextPwd = findViewById<EditText>(R.id.editTextTextPwd)

        var user : String = editTextUsr.text.toString()
        var pwd : String = editTextPwd.text.toString()

        var miIntent = Intent(this, Vista::class.java)
        miIntent.putExtra("usuario", user)
        miIntent.putExtra("apellido", pwd)
        startActivity(miIntent)
        finish()

    }

    fun salir(view: View) {
        finish()
    }
}