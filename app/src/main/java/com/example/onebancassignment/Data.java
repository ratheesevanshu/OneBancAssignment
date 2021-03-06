package com.example.onebancassignment;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Data {

    private static Dish dishNorth1 = new Dish(R.drawable.thali,"Thali",150,4);
    private static Dish dishNorth2 = new Dish(R.drawable.gulab_jamun,"Gulab Jamun",20,3);
    private static Dish dishNorth3 = new Dish(R.drawable.paneer,"Paneer",200,5);
    private static Dish dishSouth1 = new Dish(R.drawable.south_thali,"South Thali",120,4);
    private static Dish dishSouth2 = new Dish(R.drawable.dosa,"Dosa",150,5);
    private static Dish dishSouth3 = new Dish(R.drawable.idli,"",100,4);
    private static Dish dishItanian1 = new Dish(R.drawable.manchurian,"Manchurian",150,4);
    private static Dish dishItanian2 = new Dish(R.drawable.noodles,"Noodles",160,5);
    private static Dish dishItanian3 = new Dish(R.drawable.chili_potato,"Chili Potato",90,4);


    private static ArrayList<Cuisine> cuisines = new ArrayList<Cuisine>(
            Arrays.asList(
                    new Cuisine((R.drawable.north_indian),"North Indian"),
                    new Cuisine((R.drawable.south_indian),"South Indian"),
                    new Cuisine((R.drawable.italian),"Chinese"))
    );

    private static ArrayList <Dish> dishesNorth = new ArrayList<Dish>(
            Arrays.asList(
                    dishNorth1,
                    dishNorth2,
                    dishNorth3
            )
    );
    private static ArrayList <Dish> dishesSouth = new ArrayList<Dish>(
            Arrays.asList(
                    dishSouth1,
                    dishSouth2,
                    dishSouth3
            )
    );
    private static ArrayList <Dish> dishesItalian = new ArrayList<Dish>(
            Arrays.asList(
                    dishItanian1,
                    dishItanian2,
                    dishItanian3
            )
    );
    private static ArrayList <Dish> dishesTop = new ArrayList<Dish>(
            Arrays.asList(
                    dishNorth3,
                    dishItanian2,
                    dishSouth2
            )
    );

    public static ArrayList<Dish> selected = dishesItalian;

    public static void setSelected(int cuisine){
        switch (cuisine){
            case 0:
                selected = dishesNorth;
                break;
            case 1:
                selected = dishesSouth;
                break;
            case 2:
                selected = dishesItalian;
        }
    }

    public static ArrayList<Dish> getSelected() {
        return selected;
    }

    public static ArrayList<Cuisine> getCuisines() {
        return cuisines;
    }

    public static ArrayList<Dish> getDishesNorth() {
        return dishesNorth;
    }

    public static ArrayList<Dish> getDishesSouth() {
        return dishesSouth;
    }

    public static ArrayList<Dish> getDishesItalian() {
        return dishesItalian;
    }

    public static ArrayList<Dish> getDishesTop() {
        return dishesTop;
    }
}
