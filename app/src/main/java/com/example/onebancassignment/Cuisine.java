package com.example.onebancassignment;

import android.graphics.drawable.Drawable;

public class Cuisine {
    Drawable image;
    String name;

    public Cuisine(Drawable image, String name) {
        this.image = image;
        this.name = name;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
