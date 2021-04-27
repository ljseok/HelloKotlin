package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BmikotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightField = findViewById<EditText>(R.id.height_field)
        val weightField = findViewById<EditText>(R.id.weight_field)
        val btnBmi = findViewById<Button>(R.id.btn_bmi)
        val textResult = findViewById<TextView>(R.id.textResult)

        btnBmi.setOnClickListener {
            val Height = heightField.getText().toString().toDouble()
            val Weight = weightField.getText().toString().toDouble()

            val bmi = Weight / Math.pow(Height / 100,2.0);

            textResult.setText("Your BMI = " + bmi)

        }
    }
}