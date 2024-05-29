package com.pluralsight;

public enum DrinkType {

    COKE("Coke"),
    SPRITE("Sprite"),
    TEA("Tea"),
    JUICE("Juice");

    private final String name;

    DrinkType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
