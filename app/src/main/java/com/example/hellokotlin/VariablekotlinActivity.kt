package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class VariablekotlinActivity : AppCompatActivity() {
    var clickcount = 0;
    var startTime = System.currentTimeMillis();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txt_activityStarttime)
        val txtCountBtnCliks = findViewById<TextView>(R.id.txt_countbtnClicks)

        val btnClickMe = findViewById<Button>(R.id.btnClickme)

        btnClickMe.setOnClickListener {
            clickcount++;
            txtCountBtnCliks.text = "Button Clicks =  + $(clickcount)";
        }
        val timedText = SimpleDateFormat("HH:mm:ss", Locale.KOREAN).format(startTime);
        txtActivityStartTime.text = "Activity Start Time = +$(timeText)";
    }
}