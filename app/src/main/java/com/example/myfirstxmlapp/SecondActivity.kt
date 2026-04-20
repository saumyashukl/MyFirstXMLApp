package com.example.myfirstxmlapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val resultText = findViewById<TextView>(R.id.resultText)
        val name = intent.getStringExtra("username")

        resultText.text = "Hello $name"
    }
}