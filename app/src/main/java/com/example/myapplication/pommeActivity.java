package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pommeActivity extends AppCompatActivity {
Button ro4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomme);
        ro4=(Button) findViewById(R.id.ro4);

        ro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pommeActivity.this,IngredientsActivity.class);
                startActivity(i);
            }
        });
    }
}