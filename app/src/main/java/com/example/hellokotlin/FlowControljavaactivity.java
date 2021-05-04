package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FlowControljavaactivity extends AppCompatActivity {
    EditText fieldnumber;
    Button btnLD;

    @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_flowcontrol);

    fieldnumber = findViewById(R.id.fieldNumber);
    btnLD = findViewById(R.id.btnLD);

    btnLD.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int number = Integer.parseInt(fieldnumber.getText().toString());

            if(number % 2 == 0){
                Toast.makeText(getApplicationContext(),""+ number + "은(는) 2의배수 ",Toast.LENGTH_SHORT).show();
            }
            else if (number % 3 == 0){
                Toast.makeText(getApplicationContext(),""+ number + "은(는) 3의배수 ",Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(),""+ number + "은(는) else ",Toast.LENGTH_LONG).show();
            }
            switch(number){
                case 4:
                   // btnLD.setText("실행 for 4");
                   // break;
                case 9:
                    btnLD.setText("실행 for 9");
                    break;
                default:
                    btnLD.setText("실행 ");
                    break;
                    //btnLD.setText("실행 for else");

                 }
            }
        });
    }
}