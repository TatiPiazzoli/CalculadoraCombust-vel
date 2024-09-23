package com.example.calculadoracombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class ConsumoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo)

        val btnStart = findViewById<Button>(R.id.btn_next2)
        val pricefuel = intent.getFloatExtra("Key_price", 0f)
        val consumption = findViewById<TextInputEditText>(R.id.edtconsumption)
        val btnVoltar1 = findViewById<ImageView>(R.id.btn_voltar1)

        btnVoltar1.setOnClickListener {
            finish()
        }

        btnStart.setOnClickListener {

            val intent = Intent(this, DistanciaActivity::class.java)

                .apply {
                    val consumptionfuel: Float = consumption.text.toString().toFloat()
                    putExtra("Key_price", pricefuel)
                    putExtra("Key_consumption", consumptionfuel)
                }

            startActivity(intent)

        }
    }
}