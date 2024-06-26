package com.pluralsight.sides;

import com.pluralsight.interfaces.OrderItems;

public class Chip implements OrderItems {

    private ChipType type;

    public Chip(ChipType type) {
        this.type = type;
    }

    @Override
     public double getPrice(){
        return 1.50;
    }

    @Override
    public String getDetails(){
        return "Chips: " + type.getName();
    }


}
