package com.example.onebancassignment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {

    List<Dish> dishList;
    Activity activity;


    public CartAdapter(List<Dish> dishList, Activity activity) {
        this.dishList = dishList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new CartAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {

        holder.title.setText(dishList.get(position).getName());
        holder.quantity.setText(String.valueOf(dishList.get(position).getQuantity()));


    }
    @Override
    public int getItemCount() {
        return dishList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, quantity;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.name);

            quantity = itemView.findViewById(R.id.quantity);

        }


    }
}