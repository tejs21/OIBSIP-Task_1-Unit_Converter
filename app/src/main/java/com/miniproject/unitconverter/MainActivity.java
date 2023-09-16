package com.miniproject.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button length,weight, temperature,volume;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    length = findViewById(R.id.lenbtn);
    weight = findViewById(R.id.weibtn);
    temperature = findViewById(R.id.tempbtn);
    volume = findViewById(R.id.volbtn);

    length.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gotolength();
        }
    });

    weight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gotoweight();
        }
    });

    temperature.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gototemp();
        }
    });

    volume.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gotovol();
        }
    });
    }

    public void gotolength(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void gotoweight(){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void gototemp(){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }

    public void gotovol(){
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}