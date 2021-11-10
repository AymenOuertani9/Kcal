package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login_page_button;
    Button Signin_page_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_page_button = findViewById(R.id.login_page_button);
        Signin_page_button = findViewById(R.id.Signin_page_button);

        login_page_button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this , LoginActivity.class);
            startActivity(intent);
        });
        Signin_page_button.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this , SigninActivity.class);
            startActivity(intent);
        });

    }
}