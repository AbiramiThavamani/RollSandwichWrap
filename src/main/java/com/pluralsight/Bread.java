package com.pluralsight;

public class Bread {

    private BreadType type;

    private String name;
    private double price;

    public enum BreadType{
        White,wheat, rye, wrap
    }

    public Bread(BreadType type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public BreadType getType() {
        return type;
    }

    public void setType(BreadType type) {
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
