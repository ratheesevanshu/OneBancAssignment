package com.example.onebancassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Cuisine> cuisines =  new ArrayList<>();
    RecyclerView recyclerView;
    CuisineAdapter cuisineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cuisines.add(new Cuisine(getDrawable(R.drawable.south_indian),"South Indian"));
        cuisines.add(new Cuisine(getDrawable(R.drawable.north_indian),"North Indian"));
        cuisines.add(new Cuisine(getDrawable(R.drawable.italian),"Italian"));

        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false );
        recyclerView.setLayoutManager(linearLayoutManager);
        cuisineAdapter =  new CuisineAdapter(cuisines,this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        recyclerView.setAdapter(cuisineAdapter);

    }
}