package com.pluralsight.interfaces;

public class RegularTopping implements Topping {

     private String name;

    public RegularTopping(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice(int sandwichSize) {
        return 0;
    }


}
