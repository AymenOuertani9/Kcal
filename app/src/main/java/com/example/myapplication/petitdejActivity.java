package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class petitdejActivity extends AppCompatActivity {
Button pee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petitdej);
        pee=(Button) findViewById(R.id.pee);

        pee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(petitdejActivity.this,caloriesActivity.class);
                startActivity(i);
            }
        });

    }
}