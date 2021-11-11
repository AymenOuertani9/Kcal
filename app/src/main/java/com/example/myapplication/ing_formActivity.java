package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.database.MyDatabase;
import com.example.myapplication.enteties.Food;

public class ing_formActivity extends AppCompatActivity {

    EditText name;
    EditText quantity;
    EditText calories;
    Button add_ing;
    MyDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ing_form);

        name = findViewById(R.id.ing_name);
        quantity = findViewById(R.id.ing_quantity);
        calories = findViewById(R.id.ing_calories);
        add_ing = findViewById(R.id.add_ing);
        db = MyDatabase.getMyDatabase(this);

        add_ing.setOnClickListener(view -> {
            Food food = new Food(name.getText().toString() ,Float.parseFloat(calories.getText().toString()), quantity.getText().toString());
            db.foodDao().add(food);
            Toast.makeText(this , "Added successflly" , Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ing_formActivity.this , HomeActivity.class);
            startActivity(intent);

        });

    }
}