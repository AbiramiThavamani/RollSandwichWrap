package com.pluralsight;

public class Drink extends OrderItem {

    private String size;
    private String name;
    private double price;

    public Drink(String name, double price, String size, double price1) {
        super(name, price);
        this.size = size;
        this.name = name;
        this.price = price1;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getOrderDetails (){
        StringBuilder details = new StringBuilder();
        details.append("Drink:").append(size.getSize()).append("\n");
        return details.toString();
    }
}
