package com.example.onebancassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class OrderActivity extends AppCompatActivity {

    RecyclerView  dishRv;
    DishAdapter dishAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        dishRv = findViewById(R.id.dish_recyler);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        dishRv.setLayoutManager(linearLayoutManager1);
        dishAdapter =  new DishAdapter(Data.getSelected(),this,true);

    }

    @Override
    protected void onResume() {
        super.onResume();
        dishRv.setAdapter(dishAdapter);
    }
}