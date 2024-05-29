package com.pluralsight.interfaces;

public class Sauce implements Topping {

    private String name;

    public Sauce(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
