package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.database.MyDatabase;

public class LoginActivity extends AppCompatActivity {

    EditText Username;
    EditText Password;
    CheckBox keep_me;
    Button login_button;
    Button sign_in_page;
    MyDatabase db;
    SharedPreferences login_preference;
    SharedPreferences.Editor login_editor;
    boolean isAllFieldsChecked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username= findViewById(R.id.username);
        Password = findViewById(R.id.password);
        keep_me= findViewById(R.id.keep_me);
        login_button = findViewById(R.id.login_button);
        sign_in_page = findViewById(R.id.sign_in_page);
        db = MyDatabase.getMyDatabase(this);
        sign_in_page.setOnClickListener(view-> {
            Intent intent=new Intent(LoginActivity.this , SigninActivity.class);
            startActivity(intent);
        });

        login_preference = getSharedPreferences("pref_login" , MODE_PRIVATE);
        login_editor = login_preference.edit();

        login_button.setOnClickListener(view -> {
            if (CheckAllFields()) {
                if (db.userDao().Usercheck(Username.getText().toString(), Password.getText().toString()) == true) {
                    login_editor.putString("login", Username.getText().toString());
                    login_editor.putString("password", Password.getText().toString());
                    login_editor.putBoolean("isLoggedin", true);
                    login_editor.apply();
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Wrong Creeds", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    private  boolean CheckAllFields(){
        if(Username.length() == 0 ){
            Username.setError("Username is required");
            return false;
        }

        if (Password.length() == 0){
            Password.setError("Password");
            return false;
        }

        return true;
    }
}