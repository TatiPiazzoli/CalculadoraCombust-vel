package com.example.calculadoracombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class DistanciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distancia)

        val btnStart = findViewById<Button>(R.id.btn_calculate)
        val pricefuel = intent.getFloatExtra("Key_price", 0f)
        val consumptionfuel = intent.getFloatExtra("Key_consumption", 0f)
        val distance = findViewById<TextInputEditText>(R.id.edtdistance)

        btnStart.setOnClickListener {

            val intent = Intent(this, ResultActivity::class.java)

                .apply {

                    val distancefuel: Float = distance.text.toString().toFloat()
                    putExtra("Key_price", pricefuel)
                    putExtra("Key_consumption", consumptionfuel)
                    putExtra("Key_distance", distancefuel)

                }

            startActivity(intent)

        }
    }
}