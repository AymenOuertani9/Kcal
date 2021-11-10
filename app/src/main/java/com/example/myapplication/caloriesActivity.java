package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class caloriesActivity extends AppCompatActivity {
Button h ;
    Button I;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);
        h=(Button) findViewById(R.id.h);
        I=(Button) findViewById(R.id.I);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(caloriesActivity.this,secondActivity.class);
                startActivity(i);
            }
        });

        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(caloriesActivity.this,IngredientsActivity.class);
                startActivity(i);
            }
        });
    }
}