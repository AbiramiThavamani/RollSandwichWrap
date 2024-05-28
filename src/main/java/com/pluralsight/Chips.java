package com.pluralsight;

public class Chips extends OrderItem {
private  String name;

    public Chips(String name, double price) {
        super(name, price);

    }

    public double getPrice(){
        return 1.50;
    }


    public String getName(){
    return name;
    }

    public String getOrderDetails(){

        return "Chip:"+ getName();
    }

}
