package com.pluralsight.interfaces;

import com.pluralsight.SandwichSize;

public class RegularTopping implements Topping {

     private String name;


    public RegularTopping(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 0;
    }


}
