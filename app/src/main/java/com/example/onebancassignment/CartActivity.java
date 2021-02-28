package com.example.onebancassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView dishes, sgst, cgst, net;
    int _dishes=0, _sgst=0, _cgst=0, _net=0;

    ArrayList<Dish> disheList =  new ArrayList<>();
    CartAdapter cartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerView = findViewById(R.id.recyclerView);
        dishes = findViewById(R.id.dishes);
        sgst = findViewById(R.id.sgst);
        cgst = findViewById(R.id.cgst);
        net = findViewById(R.id.net);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        cartAdapter = new CartAdapter(disheList,this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        disheList.clear();

        for (Dish d : Data.getDishesNorth()){
            if(d.getQuantity()>0){
                disheList.add(d);
            }
        }
        for (Dish d : Data.getDishesSouth()){
            if(d.getQuantity()>0){
                disheList.add(d);
            }
        }
        for (Dish d : Data.getDishesItalian()){
            if(d.getQuantity()>0){
                disheList.add(d);
            }
        }
        recyclerView.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();
        for(Dish d : disheList){
            _dishes += d.getQuantity()*d.getPrice();
        }
        _cgst = (int) (_dishes*0.025);
        _sgst = (int) (_dishes*0.025);
        _net = _dishes + _sgst + _cgst;

        dishes.setText(String.valueOf(_dishes));
        sgst.setText(String.valueOf(_sgst));
        cgst.setText(String.valueOf(_cgst));
        net.setText(String.valueOf(_net));

    }
}