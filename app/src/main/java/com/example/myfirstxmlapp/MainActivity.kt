package com.example.myfirstxmlapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstxmlapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            val name = binding.nameInput.text.toString().trim()

            if (name == "") {
                binding.nameInput.error = "Please enter your name"
            } else {
                Toast.makeText(this, "Welcome $name", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("username", name)
                startActivity(intent)
            }
        }

        /*setContentView(R.layout.activity_main)

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
        }*/
    }
}