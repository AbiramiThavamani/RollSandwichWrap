package com.pluralsight;

public class Bread {

    private Bread type;

    private String name;
    private double price;

    public Bread(Bread type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public Bread getType() {
        return type;
    }

    public void setType(Bread type) {
        this.type = type;
    }

    public String getName() {
        return name;
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
}
