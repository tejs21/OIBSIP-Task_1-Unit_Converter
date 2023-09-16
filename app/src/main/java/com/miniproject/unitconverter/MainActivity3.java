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

public class MainActivity3 extends AppCompatActivity {

    EditText value;
    RadioButton gtokg, kgtog;
    TextView result;
    Button convert;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        value = findViewById(R.id.valueEditText);
        gtokg = findViewById(R.id.gToKg);
        kgtog = findViewById(R.id.kgToG);
        result = findViewById(R.id.resultTextView);
        convert = findViewById(R.id.convertButton);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter Value", Toast.LENGTH_SHORT).show();
                } else if(gtokg.isChecked()){
                    Double ediresult = Double.parseDouble(value.getText().toString());
                    result.setText(String.valueOf(ediresult / 1000+" KG"));
                } else if (kgtog.isChecked()) {
                    Double ediresult = Double.parseDouble(value.getText().toString());
                    result.setText(String.valueOf(ediresult * 1000+" G"));
                }
            }
        });
    }
}