package com.example.p1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class como_transferir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_como_transferir)

        val botaoDetalhes: Button = findViewById(R.id.botaoDetalhes)
        botaoDetalhes.setOnClickListener {
            val intent = Intent(this, detalhes::class.java)
            startActivity(intent)
        }
    }
}
