package it.karatekide.pizza.tree;

/**
 * Enum representation of the topping.
 */
public enum Topping {
    MUSHROOM("M"), TOMATO("T");

    private String value;

    Topping(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
