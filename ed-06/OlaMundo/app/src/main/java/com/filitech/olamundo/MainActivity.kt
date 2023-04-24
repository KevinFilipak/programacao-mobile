package com.filitech.olamundo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoOla = findViewById<Button>(R.id.btnOla)
        val botaoTchau = findViewById<Button>(R.id.btnTchau)

        botaoOla.setOnClickListener{
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Olá, Sou Android!")
            startActivity(Intent.createChooser(shareIntent, "Compartilhar mensagem via"))
        }

        botaoTchau.setOnClickListener{
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Tchau!")
            startActivity(Intent.createChooser(shareIntent, "Compartilhar mensagem via"))
        }
    }
}