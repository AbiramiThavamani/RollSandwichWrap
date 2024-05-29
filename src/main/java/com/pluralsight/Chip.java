package com.pluralsight;



public class Chip implements OrderItems {

    private int calories;


    public Chip(int calories) {
        this.calories = calories;
    }


    @Override
    public double getPrice(){
        return 1.50;
    }

    @Override
    public String getDetails(){
        return "Chips: " + calories.getName();
    }


}
