package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
   // var btnHello : Button
  //  val btnHello

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btnHello = findViewById<Button>(R.id.btn_hello)
        btnHello.setOnClickListener {
            Toast.makeText(this@MainActivity,"HelloKotlin",Toast.LENGTH_LONG).show()
        }
    }
}