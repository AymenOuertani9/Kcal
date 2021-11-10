package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DietActivity2 extends AppCompatActivity {
Button rrr;
    Button pe;
    Button de;
    Button di;
    Button sn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet2);

        rrr=(Button) findViewById(R.id.rrr);
        pe=(Button) findViewById(R.id.pe);
        de=(Button) findViewById(R.id.de);
        di=(Button) findViewById(R.id.di);
        sn=(Button) findViewById(R.id.sn);

        rrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DietActivity2.this,caloriesActivity.class);
                startActivity(i);
            }
        });
        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DietActivity2.this,petitdejActivity.class);
                startActivity(i);
            }
        });
        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DietActivity2.this,Dejeuner.class);
                startActivity(i);
            }
        });
        di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DietActivity2.this,Diner.class);
                startActivity(i);
            }
        });
        sn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DietActivity2.this,Snacks.class);
                startActivity(i);
            }
        });
    }
}