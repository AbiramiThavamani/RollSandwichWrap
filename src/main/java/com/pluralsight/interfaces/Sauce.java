package com.pluralsight.interfaces;


import com.pluralsight.interfaces.Topping;

public enum Sauce implements Topping {
    MAYO("Mayo"),  MUSTARD("Mustard"),  KETCHUP("Ketchup"),  RANCH("Ranch"),  THOUSAND_ISLAND("Thousand Island"),  VINAIGRETTE("Vinaigrette");
    private String name;

    Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public String getDetails() {
        return "SAUCE:" + getName();
    }

}
