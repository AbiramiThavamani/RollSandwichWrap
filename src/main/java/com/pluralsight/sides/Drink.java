package com.pluralsight.sides;

import com.pluralsight.interfaces.OrderItems;

public class Drink implements OrderItems {

    private DrinkSize size;
    private DrinkType type;

    public Drink(DrinkSize size, DrinkType type) {
        this.size = size;
        this.type = type;
    }

    public DrinkSize getSize() {
        return size;
    }

    public DrinkType getType() {
        return type;
    }

    @Override
    public double getPrice(){
        return size.getPrice();
    }

    @Override
    public String getDetails () {
        return "Drink: " + size.getName().toUpperCase() + " " + type.getName().toUpperCase();
    }
}
