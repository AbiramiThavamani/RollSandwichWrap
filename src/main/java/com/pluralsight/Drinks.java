package com.pluralsight;

public class Drinks extends OrderItem {

    private String size;
    private String name;
    private double price;
    private String type;

    public Drinks(String name, double price, String size,String type) {
        super(name, price);
        this.size = size;
        this.name = name;
        this.price = price;
        this.type = type;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrderDetails (){
        StringBuilder details = new StringBuilder();
        details.append("Drink:").append(type.getName).append("\n");
        details.append("Size:").append(size.getSize()).append("\n");
        return details.toString();
    }
}
