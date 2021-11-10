package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cacahoueteActivity extends AppCompatActivity {
Button cac ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cacahouete);
        cac=(Button) findViewById(R.id.cac);

        cac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cacahoueteActivity.this,IngredientsActivity.class);
                startActivity(i);
            }
        });
    }
}