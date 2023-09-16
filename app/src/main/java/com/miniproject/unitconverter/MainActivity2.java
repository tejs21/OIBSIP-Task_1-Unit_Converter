package com.miniproject.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText value;
    RadioButton ctom, mtocm;
    TextView result;
    Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        value = findViewById(R.id.valueEditText);
        ctom = findViewById(R.id.cmToM);
        mtocm = findViewById(R.id.mToCm);
        result = findViewById(R.id.resultTextView);
        convert = findViewById(R.id.convertButton);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter Value", Toast.LENGTH_SHORT).show();
                }else if(ctom.isChecked()){
                    Double ediresult = Double.parseDouble(value.getText().toString());
                    result.setText(String.valueOf(ediresult * 0.01+" M"));
                } else if (mtocm.isChecked()) {
                    Double ediresult = Double.parseDouble(value.getText().toString());
                    result.setText(String.valueOf(ediresult * 100+" CM"));
                }
            }
        });
    }
}