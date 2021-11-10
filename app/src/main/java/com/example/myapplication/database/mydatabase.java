package com.example.myapplication.database;

import android.content.Context;
import android.service.autofill.AutofillService;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myapplication.Entites.user;
import com.example.myapplication.dao.userdao;

import javax.xml.namespace.QName;

@Database(entities ={user.class} ,version=1 ,exportSchema = false)
public abstract class mydatabase  extends RoomDatabase {
    private static mydatabase instance ;
    public abstract userdao userdao();
    public static  mydatabase getDMydatabase(Context context){
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),mydatabase.class, "my_db" )
                    .allowMainThreadQueries()
                    .build();

        }
        return instance;
    }

}
