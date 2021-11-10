package com.example.myapplication.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.myapplication.Entites.user;

import java.util.List;

@Dao
public interface userdao {
    @Insert
    void addUser(user user);
    @Delete
    void delete(user user);
    @Query("SELECT * FROM user")
    List<user> getAlluser();
}
