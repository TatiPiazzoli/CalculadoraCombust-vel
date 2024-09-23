package com.example.calculadoracombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val btnStart = findViewById<Button>(R.id.btn_calculate2)
        val pricefuel = intent.getFloatExtra("Key_price", 0f)
        val consumptionfuel = intent.getFloatExtra("Key_consumption", 0f)
        val distancefuel = intent.getFloatExtra("Key_distance", 0f)

        val resultprice = findViewById<TextView>(R.id.tv_resultprice)
        val resultconsumption = findViewById<TextView>(R.id.tv_resultconsumption)
        val resultdistance = findViewById<TextView>(R.id.tv_resultdistance)
        val result = findViewById<TextView>(R.id.tv_result)

        val btnVoltarresult = findViewById<ImageView>(R.id.btn_voltarresult)

        btnVoltarresult.setOnClickListener {
            finish()
        }

        val calculo1 = distancefuel / consumptionfuel
        val calculofinal = calculo1 * pricefuel

        val price = if (pricefuel==pricefuel.toInt().toFloat()){
            pricefuel.toInt().toString()
        }else {
            pricefuel.toString()
        }

        val consumption = if (consumptionfuel==consumptionfuel.toInt().toFloat()){
            consumptionfuel.toInt().toString()
        }else {
            consumptionfuel.toString()
        }

        val distance = if (distancefuel==distancefuel.toInt().toFloat()){
            distancefuel.toInt().toString()
        } else {
            distancefuel.toString()
        }

        val calculo = if (calculofinal==calculofinal.toInt().toFloat()){
            calculofinal.toInt().toString()
        } else {
            calculofinal.toString()
        }

        result.text = calculo
        resultprice.text = price
        resultconsumption.text = consumption
        resultdistance.text = distance

        btnStart.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}