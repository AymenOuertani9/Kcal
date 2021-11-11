package com.example.myapplication.dao;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.myapplication.enteties.Food;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface FoodDao {

    @Query("select * from Food")
    LiveData<List<Food>> getAllfoods();

    @Query("select * from Food where id like :id")
    Food findfood(int id);

    @Insert
    void add(Food food);

}

