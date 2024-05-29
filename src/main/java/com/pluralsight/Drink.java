package com.pluralsight;

public class Drink implements OrderItems {

    private String size;
    private String type;

    public Drink(String size, String type) {
        this.size = size;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
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
