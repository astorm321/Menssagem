package com.example.menssagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostraMenssagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_menssagem)

        val menssagem = intent.getStringExtra("MENSSAGEM")

        val textViewMenssagem = findViewById<TextView>(R.id.textViewMenssagem)
        textViewMenssagem.text = menssagem
    }
}