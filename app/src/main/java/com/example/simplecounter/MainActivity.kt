package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    internal lateinit var  value: TextView
    internal lateinit var  buttonPlus: Button
    internal lateinit var  buttonMinus: Button
    internal lateinit var  buttonReset: Button


    internal var id = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        value = findViewById(R.id.value)
        buttonPlus = findViewById(R.id.buttonPlus)
        buttonMinus = findViewById(R.id.buttonMinus)
        buttonReset = findViewById(R.id.buttonReset)

        value.setText("" + id)

        buttonPlus.setOnClickListener {
            value.setText(""+ ++id)
        }

        buttonMinus.setOnClickListener {
            value.setText(""+ --id)
        }
        buttonReset.setOnClickListener {
            id = 0
            value.setText("" + id)
        }

    }
}