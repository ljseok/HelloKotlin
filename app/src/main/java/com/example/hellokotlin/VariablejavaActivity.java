package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariablejavaActivity extends AppCompatActivity {
    TextView txtActivityStartTime , txtCountbtnCliks;
    Button btnClickme;

    final long startTime = System.currentTimeMillis();

    int clickcount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txt_activityStarttime);
        txtCountbtnCliks = findViewById(R.id.txt_countbtnClicks);
        btnClickme = findViewById(R.id.btnClickme);

        btnClickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount++;
                txtCountbtnCliks.setText("Button Clicks" + clickcount);
            }
        });
        String timetext = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        txtActivityStartTime.setText("Activity start time = " + timetext);
        txtCountbtnCliks.setText("Ready to start counting cliks ");
    }
}