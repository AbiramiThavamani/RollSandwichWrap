package com.pluralsight;

public enum ChipType {
    JALAPENO("jalapeno"),
    SEASALT("sea salt"),
    CHEESE("cheese"),
    SPICY("spicy");

    private String name;

    ChipType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
