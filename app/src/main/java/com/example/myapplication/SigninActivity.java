package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.myapplication.database.MyDatabase;
import com.example.myapplication.enteties.User;

public class SigninActivity extends AppCompatActivity {

    EditText username_signin;
    EditText password;
    EditText password_repeat;
    EditText name;
    String gender;
    Button signin_button;
    MyDatabase db;
    RadioButton gender_M;
    RadioButton gender_F;
    Button login_page_button;
    boolean isAllFieldsChecked = false;
    RadioGroup gender_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        username_signin = findViewById(R.id.username_signin);
        password = findViewById(R.id.password);
        password_repeat = findViewById(R.id.password_repeat);
        name = findViewById(R.id.name);
        signin_button =findViewById(R.id.signin_button);
        db = MyDatabase.getMyDatabase(this);
        gender_M = findViewById(R.id.gender_M);
        gender_F = findViewById(R.id.gender_F);
        login_page_button = findViewById(R.id.login_page_button);
        gender_group=findViewById(R.id.gender_group);


        signin_button.setOnClickListener(view -> {
            if (CheckAllFields()) {
                if (gender_F.isChecked()) {
                    gender = "femele";
                } else if (gender_M.isChecked()) {
                    gender = "Male";
                }
                User user = new User(name.getText().toString(), username_signin.getText().toString(), password.getText().toString(), gender);
                db.userDao().signin(user);
                Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show();
                Log.d("here", "here sing in");
            }
        });

        login_page_button.setOnClickListener(view->{
            Intent intent = new Intent(SigninActivity.this , LoginActivity.class);
            startActivity(intent);
        });


    }

    private boolean CheckAllFields() {
        if (username_signin.length() == 0) {
            username_signin.setError("Username is required");
            return false;
        }

        if (password .length()==0) {
            password.setError("Password is required");
            return  false;
        }

        if(password.length() < 8) {
            password.setError("Password must contains at least 8 charachters");
            return false;
        }

        if (!password_repeat.getText().toString().equals(password.getText().toString())) {
            password_repeat.setError("password missmatch");
            return  false;
        }
        if (name.length()==0){
            name.setError("Name is required");
            return false;
        }

        if  ( gender_group.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Please select Gender", Toast.LENGTH_SHORT).show();
        }
        return true;
    };


}