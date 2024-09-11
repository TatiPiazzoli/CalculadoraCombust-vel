package com.example.calculadoracombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class PrecoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preco)

        val price = findViewById<TextInputEditText>(R.id.edtprice)

        val btnStart = findViewById<Button>(R.id.btn_next1)

        btnStart.setOnClickListener {

            val intent = Intent(this, ConsumoActivity::class.java)

                .apply {
                    val pricefuel: Float = price.text.toString().toFloat()
                    putExtra("Key_price", pricefuel)
                }

            startActivity(intent)

        }
    }
}