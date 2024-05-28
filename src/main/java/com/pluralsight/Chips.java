package com.pluralsight;

public class Chips extends OrderItem {

private final Chips type;
private final String name;

public enum ChipType{
    regular,salted,cheese,spicy;
}

    public Chips(String name, double price, Chips type, String name1) {
        super(name, price);
        this.type = type;
        this.name = name1;
    }

    public double getPrice(){
        return 1.50;
    }

    public String getOrderDetails(){
        return "Chip:" + type.getName();
    }

    public String getName(){
    return name;
    }

    public Chips getType() {
        return type;
    }
}
