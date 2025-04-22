package com.example.p1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class valor_transferencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_valor_transferencia)

        val botaoParaQuem: ImageButton = findViewById(R.id.botaoParaQuem)
        botaoParaQuem.setOnClickListener {
            var intent = Intent(this, para_quem()::class.java)
            startActivity((intent))
        }

    }
}
