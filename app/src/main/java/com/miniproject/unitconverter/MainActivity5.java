package com.miniproject.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    EditText value;
    RadioButton litToMl,MlTolit;
    TextView result;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        value = findViewById(R.id.valueEditText);
        litToMl = findViewById(R.id.LitToMl);
        MlTolit = findViewById(R.id.MlToLit);
        result = findViewById(R.id.resultTextView);
        convert = findViewById(R.id.convertButton);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter Value", Toast.LENGTH_SHORT).show();
                }else if(litToMl.isChecked()){
                    Double ediresult = Double.parseDouble(value.getText().toString());
                    result.setText(String.valueOf((1000 * ediresult))+" ML");
                } else if (MlTolit.isChecked()) {
                    Double ediresult = Double.parseDouble(value.getText().toString());
                    result.setText(String.valueOf((ediresult/1000))+" L");
                }
            }
        });
    }
}