package com.example.myapplication;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.myapplication.dao.FoodDao;
import com.example.myapplication.database.MyDatabase;
import com.example.myapplication.enteties.Food;

import java.util.List;

public class FoodViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();
    FoodDao foodDao;
    MyDatabase db;
    LiveData<List<Food>> mAllFoods;
    public FoodViewModel(Application application) {

        super(application);
        //foodDao = db.foodDao();
        //mAllFoods = foodDao.getAllfoods();
        db = MyDatabase.getMyDatabase(application);
    }

    LiveData<List<Food>> getAllfoods() {

        return db.foodDao().getAllfoods();
    }
    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "ViewModel Destroyed");
    }

    private class OperationsAsyncTask extends AsyncTask<Food, Void, Void> {

        FoodDao mAsyncTaskDao;

        OperationsAsyncTask(FoodDao dao) {
            this.mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(Food... foods) {
            return null;
        }
    }

    private class InsertAsyncTask extends OperationsAsyncTask {

        InsertAsyncTask(FoodDao mFoodDao) {
            super(mFoodDao);
        }
    }

}