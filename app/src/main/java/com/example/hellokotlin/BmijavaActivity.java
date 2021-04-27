package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmijavaActivity extends AppCompatActivity {
    EditText heightfield,weightfield;
    TextView txtResult;
    Button btnBmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        heightfield = findViewById(R.id.height_field);
        weightfield =findViewById(R.id.weight_field);
        txtResult = findViewById(R.id.textResult);
        btnBmi = findViewById(R.id.btn_bmi);

        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sHeight , sWeight;
                try{
                     sHeight = heightfield.getText().toString();
                     sWeight = weightfield.getText().toString();
                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sWeight)/100.,2.);
                    txtResult.setText("Your BMI = " + bmi);
                } catch ( Exception e) {
                    txtResult.setText("input(S) missing");
                }
            }
        });

    }
}