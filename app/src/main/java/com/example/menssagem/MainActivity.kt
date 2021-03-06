package com.example.menssagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMenssagem(view: View) {
        val editTextMenssagem = findViewById<EditText>(R.id.editTextMenssagem)
        val menssagem = editTextMenssagem.text.toString()

        val intent = Intent(this, MostraMenssagemActivity::class.java)
        intent.putExtra("MENSSAGEM",menssagem)
        startActivity(intent)
    }
}