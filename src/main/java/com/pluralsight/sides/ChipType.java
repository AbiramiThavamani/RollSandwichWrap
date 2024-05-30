package com.pluralsight.sides;

public enum ChipType {
    JALAPENO("Jalapeno"),
    SEASALT("Sea salt"),
    CHEESE("Cheese"),
    SPICY("Spicy");

    private String name;

    ChipType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
