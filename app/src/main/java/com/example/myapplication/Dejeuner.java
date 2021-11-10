package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dejeuner extends AppCompatActivity {
Button dee ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dejeuner);
        dee=(Button) findViewById(R.id.dee);

        dee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dejeuner.this,caloriesActivity.class);
                startActivity(i);
            }
        });
    }
}