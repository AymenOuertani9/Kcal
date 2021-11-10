package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class floconActivity extends AppCompatActivity {
Button fr ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flocon);
        fr=(Button) findViewById(R.id.fr);

        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(floconActivity.this,IngredientsActivity.class);
                startActivity(i);
            }
        });
    }
}