package com.miniproject.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    EditText value;
    RadioButton celtofar, fartocel;
    TextView result;
    Button convert;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        value = findViewById(R.id.valueEditText);
        celtofar = findViewById(R.id.celTofar);
        fartocel = findViewById(R.id.farTocel);
        result = findViewById(R.id.resultTextView);
        convert = findViewById(R.id.convertButton);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter Value", Toast.LENGTH_SHORT).show();
                }else if(celtofar.isChecked()){
                    Double ediresult = Double.parseDouble(value.getText().toString());
                    result.setText(String.valueOf((1.8 * ediresult)+32+" Far"));
                } else if (fartocel.isChecked()) {
                    Double ediresult = Double.parseDouble(value.getText().toString());
                    result.setText(String.valueOf((ediresult - 32) * 5 / 9+" Cel"));
                }
            }
        });
    }
}