package com.example.calculadorajuros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun acessar(view: View){

        val intent = Intent(this, paginadois::class.java).apply {

        }

        startActivity(intent)

    }

}