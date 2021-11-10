package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Entites.user;
import com.example.myapplication.database.mydatabase;

import java.util.List;

public class secondActivity extends AppCompatActivity {
   EditText a;
    EditText a2;
    TextView show;
    TextView hellotv;
    Button add;
    Button btnl;
    Button showbtn;
    Button ca;
    Button ca2;
    mydatabase db ;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        a = findViewById(R.id.a);
        a2 = findViewById(R.id.a2);
        show = findViewById(R.id.show);
        hellotv = findViewById(R.id.hellotv);
        add= findViewById(R.id.add);
        showbtn= findViewById(R.id.showbtn);
        btnl= findViewById(R.id.btnl);
        ca=(Button) findViewById(R.id.ca);
        ca2=(Button) findViewById(R.id.ca2);

        ca.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent i = new Intent(secondActivity.this,caloriesActivity.class);
                                              startActivity(i);
                                  }
                              });
        ca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(secondActivity.this,caloriesBREAKActivity.class);
                startActivity(i);
            }
        });



        db = mydatabase.getDMydatabase(this);

        sharedPreferences =  getSharedPreferences("my_per",MODE_PRIVATE);
        String login = sharedPreferences.getString("login","Abdallah");
        hellotv.setText(String.format("Hello %s ",login));
          System.out.println(sharedPreferences);
        add.setOnClickListener(view ->{
            user user = new user(a.getText().toString(),a2.getText().toString());
            db.userdao().addUser(user);
            Toast.makeText(this, "useradded",Toast.LENGTH_SHORT).show();

        });

        showbtn.setOnClickListener( view->{
            List<user> users = db.userdao().getAlluser();
            StringBuilder s = new StringBuilder();
            for(user u : users){
                s.append(u) ;
                s.append("\n");

            }
            show.setText(s);
        });

        btnl.setOnClickListener(View ->{
            sharedPreferences.edit().clear().apply();
            finish();
        });
    }
}