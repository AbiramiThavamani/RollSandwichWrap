package com.pluralsight;

import com.pluralsight.interfaces.Sauce;
import com.pluralsight.interfaces.Topping;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private List<Topping> toppings;
    private List<Sauce> sauces;
    private String bread;
    private int sandwichSize;
    private boolean toasted;

    public Sandwich(  String bread, int sandwichSize) {
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.bread = bread;
        this.sandwichSize = sandwichSize;
        this.toasted = false;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<Sauce> getSauces() {
        return sauces;
    }

    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public void addSauce(Sauce sauce){
        sauces.add(sauce);
    }

    public double getPrice(){
        double totalPrice = bread.getPrice();

        for (Topping topping : toppings){
            totalPrice += topping.getPrice(sandwichSize);
        }

        return totalPrice;
    }
}
