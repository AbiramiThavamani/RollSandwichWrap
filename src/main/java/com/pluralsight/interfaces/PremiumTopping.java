package com.pluralsight.interfaces;

import com.pluralsight.SandwichSize;

public class PremiumTopping implements Topping{

    private String name;
     private double basePrice;

    public PremiumTopping(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(double price) {
        this.basePrice = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getPrice(SandwichSize size){
        double price = basePrice;
        if (size == SandwichSize.FOUR){
            price *= 1.00;

        } else if (size == SandwichSize.EIGHT) {
            price *= 2.0;

        } else if (size == SandwichSize.TWELVE) {
            price *= 3.0;

        }
        return price;
    }
}
