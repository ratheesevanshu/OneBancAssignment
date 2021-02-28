package com.example.onebancassignment;

public class Dish {
    int image;
    String name;
    int price;
    int rating;
    int quantity;

    public Dish(int image, String name, int price, int rating) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.quantity = 0;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getQuantity() {
        return quantity;
    }

    public void incQuantity() {
        this.quantity += 1;
    }
    public void decQuantity() {
        if(this.quantity>0){
            this.quantity -= 1;
        }
    }
}
