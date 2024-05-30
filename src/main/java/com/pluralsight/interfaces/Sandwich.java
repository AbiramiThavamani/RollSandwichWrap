package com.pluralsight.interfaces;


import com.pluralsight.classes.Topping;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements OrderItems {

    private static List<Topping> toppings;
    private static  List<Sauce> sauces;
    private SandwichBread type;
    private SandwichSize size;
    private boolean toasted;

    public Sandwich(SandwichBread type, SandwichSize size) {
        this.type = type;
        this.size = size;
        toppings = new ArrayList<>();
        sauces = new ArrayList<>();
        this.toasted = false;
    }

    public SandwichBread getType() {
        return type;
    }

    public SandwichSize getSize() {
        return size;
    }

    public static void addTopping(Topping topping){
        toppings.add(topping);
    }

    public static void addSauce(Sauce sauce){
        sauces.add(sauce);
    }


     @Override
    public double getPrice(){
        double totalPrice = size.getPrice();

        for (Topping topping : toppings){
            totalPrice += topping.getPrice(size);
        }

        return totalPrice;
    }

    @Override
    public String getDetails(){
        return "SIZE: " + size.getInches() + "\n"
                + "BREAD: " + type.getName() + "\n"
                +"TOPPINGS: " + toppings + "\n"
                + "SAUCES: " + sauces + "\n"
                +"TOASTED:" + (toasted ? "YES" : "NO");
    }

    public void setToasted(boolean toasted){
        this.toasted = toasted;
    }
}
