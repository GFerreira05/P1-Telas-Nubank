package com.example.p1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class para_quem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_para_quem)

        val botaoDadoTransferido: ImageButton = findViewById(R.id.botaoDadoTransferido)
        botaoDadoTransferido.setOnClickListener {
            val intent = Intent(this, dado_transferido::class.java)
            startActivity(intent)
        }

    }
}
