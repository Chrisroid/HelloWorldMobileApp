package com.example.helloworldmobileapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subtract = findViewById<Button>(R.id.decrement)
        var text = findViewById<TextView>(R.id.text)
        val add = findViewById<Button>(R.id.increment)

        subtract.setOnClickListener {
            count--
            text.text = "$count"
        }
        add.setOnClickListener {
            count++
            text.text = "$count"
        }
    }


}