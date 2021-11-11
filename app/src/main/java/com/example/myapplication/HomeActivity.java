package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import android.view.MenuItem;

import com.example.myapplication.database.MyDatabase;
import com.example.myapplication.enteties.Food;

import com.google.android.material.bottomnavigation.BottomNavigationView;


import java.util.List;

public class HomeActivity extends AppCompatActivity{

    BottomNavigationView navigationView;
    ActionBar actionBar;
    MyDatabase db;
    RecyclerView recyclerView;
    List<Food> food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Profile Activity");
        navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(selectedListener);
        actionBar.setTitle("Home");

        HomeFragment fragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, fragment, "");
        fragmentTransaction.commit();


    }

    public void ingForm (){
        //actionBar.setTitle("Add ing");
        AddingFragment fragment = new AddingFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, fragment, "");
        fragmentTransaction.commit();
    }


    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.home :
                    actionBar.setTitle("Home");
                    HomeFragment fragment=new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, fragment, "");
                    fragmentTransaction.commit();
                    return true;
                case R.id.settings:
                    actionBar.setTitle("Settings");
                    SettingsFragment fragment1 = new SettingsFragment();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.content, fragment1, "");
                    fragmentTransaction1.commit();
                    return true;
                case R.id.premuim:
                    actionBar.setTitle("Premuim");
                    PremuimFragment fragment2 = new PremuimFragment();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.content, fragment2 , "");
                    fragmentTransaction2.commit();
                    return true;
                case R.id.contact:
                    actionBar.setTitle("Contact");
                    ContactFragment fragment3 = new ContactFragment();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.content, fragment3 , "");
                    fragmentTransaction3.commit();
                    return true;
            }
            return false;
        }
    };
}