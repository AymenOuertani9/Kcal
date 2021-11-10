package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.database.MyDatabase;
import com.example.myapplication.enteties.User;

public class SettingsActivity extends AppCompatActivity {

    Button logout_button;
    EditText name2;
    EditText password2;
    Button update_button;
    MyDatabase db;
    SharedPreferences login_preference;
    SharedPreferences.Editor login_editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        logout_button = findViewById(R.id.logout_button);
        name2 = findViewById(R.id.name2);
        password2 = findViewById(R.id.password2);
        update_button = findViewById(R.id.update_button);

        login_preference = getSharedPreferences("pref_login", MODE_PRIVATE);
        login_editor = login_preference.edit();

        db = MyDatabase.getMyDatabase(this);


        User user = db.userDao().findUser(login_preference.getString("login", ""));
        name2.setText(String.valueOf(user.getName()));
        password2.setText(String.valueOf(user.getPassword()));


        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("clicked", "onCreate: ");
                login_editor.putString("login" , "");
                login_editor.putString("password" , "");
                login_editor.putBoolean("isLoggedin" , true);
                login_editor.commit();
                Toast.makeText(SettingsActivity.this, "Logout successfully", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(SettingsActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });

    }
}