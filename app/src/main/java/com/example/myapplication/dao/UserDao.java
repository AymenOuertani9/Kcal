package com.example.myapplication.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.enteties.User;

@Dao
public interface UserDao {

    @Insert
    void signin(User user);

    @Query("SELECT * from user_table where username like :username AND password like :password ")
    boolean Usercheck(String username , String password);

    @Query("UPDATE user_table SET name = :name , password = :password WHERE id = :id")
    int updateUser(String name , String password , int id);

    @Query("SELECT * FROM user_table where username like :username")
    User findUser(String username);

}
