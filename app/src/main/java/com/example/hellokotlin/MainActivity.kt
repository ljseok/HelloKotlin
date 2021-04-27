package com.example.hellokotlin

import android.content.Intent
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

        val btnjava = findViewById<Button>(R.id.btn_java)
        val btnkotlin = findViewById<Button>(R.id.btn_kotlin)

        var intent : Intent


        btnjava.setOnClickListener {
            intent = Intent(this@MainActivity,BmijavaActivity::class.java)
            startActivity(intent)
        }

        btnkotlin.setOnClickListener {
            intent = Intent(this@MainActivity,BmikotlinActivity::class.java)
            startActivity(intent)
        }
    }
}