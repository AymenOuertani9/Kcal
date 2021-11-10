package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thonActivity extends AppCompatActivity {
Button ro5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thon);
        ro5=(Button) findViewById(R.id.ro5);

        ro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(thonActivity.this,IngredientsActivity.class);
                startActivity(i);
            }
        });
    }
}