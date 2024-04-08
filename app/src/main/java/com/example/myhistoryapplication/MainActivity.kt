package com.example.myhistoryapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.util.Log

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


                val enterButton: Button = findViewById(R.id.enterButton)
                val clearButton: Button = findViewById(R.id.clearButton)
                val ageInput: EditText = findViewById(R.id.ageInput)
                val resultTextView: TextView = findViewById(R.id.resultTextView)

                // Define a map of historical figures and their ages
                val historicalFigures = mapOf(
                    30 to "Steve Biko",
                    90 to "Desmond Tutu",
                    76 to "Miriam Makeba",
                    78 to "Hugh Masekela",
                    95 to "Nelson Mandela",
                    81 to "Winnie Mandela",
                    50 to "Chris hani",
                    39 to "Brenda Fassie",
                    75 to "Oliver Tambo",
                    92 to "Abertina Nontsikelelo Sisulu"
                )

                // Handle the Enter button click
        enterButton.setOnClickListener {
            val ageText = ageInput.text.toString()
            Log.d("MainActivity", "Entered Age: $ageText")

            val age = ageText.toIntOrNull()

            if (age == null || age <= 20 || age > 100) {
                resultTextView.text = "Error: Age is in an invalid format or outside the required range (20-100)."
                Log.d("MainActivity", "Invalid age input.")
            } else {
                val figureName = historicalFigures[age]
                if (figureName != null) {
                    resultTextView.text = "You are the same age as $figureName!"
                    Log.d("MainActivity", "Match found: $figureName")
                } else {
                    resultTextView.text = "No historical figure matches your age."
                    Log.d("MainActivity", "No match found.")
                }

                clearButton.setOnClickListener {
                    ageInput.text.clear()
                    resultTextView.text = ""
                        }
                    }
                }


                }
            }
