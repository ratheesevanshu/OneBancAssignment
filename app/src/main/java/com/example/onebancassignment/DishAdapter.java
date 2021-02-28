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


public class DishAdapter extends RecyclerView.Adapter<DishAdapter.ViewHolder> {

    List<Dish> dishList;
    Activity activity;
    Boolean showQuantity;


    public DishAdapter(List<Dish> dishList, Activity activity, Boolean showQuantity) {
        this.dishList = dishList;
        this.activity = activity;
        this.showQuantity = showQuantity;
    }

    @NonNull
    @Override
    public DishAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dish, parent, false);
        return new DishAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DishAdapter.ViewHolder holder, int position) {

        holder.title.setText(dishList.get(position).getName());
        holder.price.setText(String.valueOf(dishList.get(position).getPrice()));
        holder.rating.setText(String.valueOf(dishList.get(position).getRating()));
        holder.quantity.setText(String.valueOf(dishList.get(position).getQuantity()));


        holder.imageView.setImageDrawable(activity.getResources().getDrawable(dishList.get(position).getImage()));
        if(showQuantity){
            holder.quantity_layout.setVisibility(View.VISIBLE);
        }else {
            holder.quantity_layout.setVisibility(View.GONE);

        }
        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishList.get(position).incQuantity();
                holder.quantity.setText(String.valueOf(dishList.get(position).getQuantity()));
            }
        });
        holder.sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishList.get(position).decQuantity();
                holder.quantity.setText(String.valueOf(dishList.get(position).getQuantity()));
            }
        });
    }
    @Override
    public int getItemCount() {
        return dishList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, quantity, price, rating;
        ImageView imageView;
        View quantity_layout;
        ImageView add , sub;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.imageView);
            quantity_layout = itemView.findViewById(R.id.quantity_layout);
            add = itemView.findViewById(R.id.add);
            sub = itemView.findViewById(R.id.sub);
            quantity = itemView.findViewById(R.id.quantity);
            price = itemView.findViewById(R.id.price);
            rating = itemView.findViewById(R.id.rating);

        }


    }
}