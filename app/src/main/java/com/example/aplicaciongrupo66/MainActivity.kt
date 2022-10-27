package com.example.aplicaciongrupo66

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity: AppCompatActivity() {

    private  var edtusername:  EditText? = null
    private  var edtpassword : EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ingresar(botnlogin: View){

        val intento= Intent(this,welcomActivity2::class.java)
        startActivity(intento)
       //hay que  hacer
       //Prueba segundo commit
    }
}