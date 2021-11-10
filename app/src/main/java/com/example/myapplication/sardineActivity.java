package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sardineActivity extends AppCompatActivity {
  Button  ro3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sardine);
        ro3=(Button) findViewById(R.id.ro3);

        ro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sardineActivity.this,IngredientsActivity.class);
                startActivity(i);
            }
        });
    }
}