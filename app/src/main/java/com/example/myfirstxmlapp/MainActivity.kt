package com.example.myfirstxmlapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val button = findViewById<Button>(R.id.nextButton)

        button.setOnClickListener {
            val name = nameInput.text.toString().trim()

            if (name == "") {
                nameInput.error = "Please enter your name"
            } else {
                Toast.makeText(this, "Welcome $name", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("username", name)
                startActivity(intent)
            }
        }
    }
}