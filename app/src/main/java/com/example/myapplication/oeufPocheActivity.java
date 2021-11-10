package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class oeufPocheActivity extends AppCompatActivity {
Button ro ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oeuf_poche);
        ro=(Button) findViewById(R.id.ro);

        ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(oeufPocheActivity.this,IngredientsActivity.class);
                startActivity(i);
            }
        });
    }
}