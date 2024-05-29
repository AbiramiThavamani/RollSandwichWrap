package com.pluralsight.interfaces;

public class Sides implements Topping{


    private String name;

    public Sides(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
