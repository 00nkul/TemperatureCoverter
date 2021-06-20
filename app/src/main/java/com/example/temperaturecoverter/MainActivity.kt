package com.example.temperaturecoverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convertBtn : Button = findViewById(R.id.convertBtn)
        val tvInput :TextView = findViewById(R.id.etTemp)
        val outText:TextView = findViewById(R.id.tvOut)

        convertBtn.setOnClickListener{
            val temperatureCelcius :Double = tvInput.text.toString().toDouble()

            var newTemp:Double = (temperatureCelcius * 1.8) + 32

            outText.setText("Temperatur in Farehinite is $newTemp")

        }

    }
}