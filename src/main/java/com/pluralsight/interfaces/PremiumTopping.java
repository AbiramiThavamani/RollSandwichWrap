package com.pluralsight.interfaces;

public class PremiumTopping implements Topping{

    private String name;
     private double price;

    public PremiumTopping(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
