package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText idlogin;
    EditText idpass;
    Button idb;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences( "my_pref",MODE_PRIVATE);
        editor = sharedPreferences.edit();

        if (sharedPreferences.getString("login","").equals("") && sharedPreferences.getString("pass","").equals("")){
            idlogin = findViewById(R.id.idlogin);
            idpass = findViewById(R.id.idpass);
            idb = findViewById(R.id.idb);

            idb.setOnClickListener(view ->{

                editor.putString( "login",idlogin.getText().toString());
                editor.putString( "pass",idpass.getText().toString());
                editor.apply();
                Intent intent =new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent);
            });


        }
        else {

            Intent intent =new Intent(MainActivity.this,secondActivity.class);
            startActivity(intent);

        }


    }
}