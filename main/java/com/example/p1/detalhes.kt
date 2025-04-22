package com.example.p1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detalhes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes)

        val botaoSenha: Button = findViewById(R.id.botaoSenha)
        botaoSenha.setOnClickListener {
            val intent = Intent(this, senha::class.java)
            startActivity(intent)
        }

    }
}