package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.enteties.Food;

import java.util.List;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.FoodViewHolder> {


    private final LayoutInflater layoutInflater;
    private Context mContext;
    private List<Food> foods;

    public FoodListAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
        mContext = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.food_layout, parent, false);
        FoodViewHolder viewHolder = new FoodViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        if (foods != null) {
            Food food = foods.get(position);
            holder.setData(food, position);
        }
    }

    @Override
    public int getItemCount() {
        if (foods != null)
            return foods.size();
        else return 0;
    }

    public void setFoods(List<Food> Foods) {
        foods = Foods;
        notifyDataSetChanged();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView quantity;
        private TextView calories;

        public FoodViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.Name);
            quantity = itemView.findViewById(R.id.quantity);
            calories = itemView.findViewById(R.id.calories);
        }

        public void setData(Food food, int position) {
            name.setText(food.getName());
            quantity.setText(food.getQuantity());
            if (food.getCalories() == 0) {
                calories.setText((int) food.getCalories());
            } else {
                calories.setText("not Available");
            }
        }
    }
}