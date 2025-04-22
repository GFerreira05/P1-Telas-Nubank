package com.example.p1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class area_pix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_area_pix)

        val botaoTransferir: ImageButton = findViewById(R.id.botaoTransferir)
        botaoTransferir.setOnClickListener {
            val intent = Intent(this, valor_transferencia::class.java)
            startActivity(intent)
        }
    }
}