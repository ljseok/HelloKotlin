package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FlowControlkotlinactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val btnLd = findViewById<Button>(R.id.btnLD)
        val fieldNumber = findViewById<EditText>(R.id.fieldNumber)

        btnLd.setOnClickListener {
            val number = fieldNumber.text.toString().toInt()

            if(number % 2 == 0) {
                Toast.makeText(getApplicationContext(),""+ number + "은(는) 2의배수 ", Toast.LENGTH_SHORT).show()
            }else if (number % 3 == 0){
                Toast.makeText(getApplicationContext(),""+ number + "은(는) 3의배수 ",Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(getApplicationContext(),""+ number + "은(는) else ",Toast.LENGTH_LONG).show()
            }
            when(number){
                // 4 -> btnLd.text = "실행 for 4"
                9 -> btnLd.text = "실행 for"
                else -> btnLd.text = "실행 for else"
            }
        }
    }
}