package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class omleteActivity extends AppCompatActivity {
  Button ro1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omlete);

        ro1=(Button) findViewById(R.id.ro1);

        ro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(omleteActivity.this,IngredientsActivity.class);
                startActivity(i);
            }
        });

    }
}