package com.example.p1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dado_transferido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dado_transferido)

        val botaoComoTransferir: Button = findViewById(R.id.botaoComoTransferir)
        botaoComoTransferir.setOnClickListener {
            val intent = Intent(this, como_transferir::class.java)
            startActivity(intent)
        }

    }
}
