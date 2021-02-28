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




public class CuisineAdapter extends RecyclerView.Adapter<CuisineAdapter.ViewHolder> {

    List<Cuisine> cuisineList;
    Activity activity;


    public CuisineAdapter(List<Cuisine> cuisineList, Activity activity) {
        this.cuisineList = cuisineList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public CuisineAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cuisne, parent, false);
        return new CuisineAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CuisineAdapter.ViewHolder holder, int position) {

        holder.title.setText(cuisineList.get(position).getName());
        holder.imageView.setImageDrawable(activity.getResources().getDrawable(cuisineList.get(position).getImage()));

    }
    @Override
    public int getItemCount() {
        return cuisineList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imageView;
        View full;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);
            full = itemView.findViewById(R.id.full);
        }

    }
}