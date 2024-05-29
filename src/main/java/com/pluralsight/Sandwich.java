package com.pluralsight;

import com.pluralsight.interfaces.Sauce;
import com.pluralsight.interfaces.Topping;

import java.util.List;

public class Sandwich {

    private List<Topping> toppings;
    private List<Sauce> sauces;
    private String bread;
    private  int sandwichSize  ;
    private boolean toasted;
    private final int size;

    public Sandwich(List<Topping> toppings, List<Sauce> sauces, String bread, int sandwichSize, boolean toasted, int size) {
        this.toppings = toppings;
        this.sauces = sauces;
        this.bread = bread;
        this.sandwichSize = sandwichSize;
        this.toasted = toasted;
        this.size = size;
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

    public int getSize() {
        return size;
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


    public String getOrderDetails(){
        StringBuilder details = new StringBuilder();
        details.append("size: ").append(sandwichSize.getSize()).append("\n");
        details.append("Bread:").append(bread.getName()).append("\n");
        details.append("Toppings:").append("\n");

        for (Topping topping : toppings){
            details.append("-").append(topping.getName()).append("\n");
        }

        details.append("Sauces:").append("\n");

        for (Sauce sauce : sauces){
            details.append("-").append(sauce.getName()).append("\n");
        }

        details.append("Toasted:").append(toasted ? "yes" : "no").append("\n");
        return details.toString();
    }

}
