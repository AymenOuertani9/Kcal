package com.example.myapplication.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myapplication.dao.FoodDao;
import com.example.myapplication.dao.UserDao;
import com.example.myapplication.enteties.User;
import com.example.myapplication.enteties.Food;

@Database(entities = {User.class , Food.class} , version = 6 , exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    private static MyDatabase instance;
    public abstract UserDao userDao();
    public abstract FoodDao foodDao();

    public static MyDatabase getMyDatabase(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext() , MyDatabase.class , "my_db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries().build();
        }
        return instance;
    }
}
