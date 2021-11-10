package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class caloriesActivity extends AppCompatActivity {
Button h ;
    Button I;
    Button Diet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);
        h=(Button) findViewById(R.id.h);
        I=(Button) findViewById(R.id.I);
        Diet=(Button) findViewById(R.id.Diet);
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
        Diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(caloriesActivity.this,DietActivity2.class);
                startActivity(i);
            }
        });
    }
}