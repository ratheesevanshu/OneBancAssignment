package com.example.onebancassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Cuisine> cuisines =  new ArrayList<>();
    RecyclerView recyclerView, dishRv;
    CuisineAdapter cuisineAdapter;
    DishAdapter dishAdapter;
    Button cart;
    Activity activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        cuisines = Data.getCuisines();

        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false );
        recyclerView.setLayoutManager(linearLayoutManager);
        cuisineAdapter =  new CuisineAdapter(cuisines,this);

        dishRv = findViewById(R.id.dishes_recycler);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        dishRv.setLayoutManager(linearLayoutManager1);
        dishAdapter =  new DishAdapter(Data.getDishesTop(),this,false);

        cart = findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity, CartActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        recyclerView.setAdapter(cuisineAdapter);

        dishRv.setAdapter(dishAdapter);
    }
}