package edu.hogwarts;

public class Ingredient extends TeachingMaterial {
    private String name;
    private double amount;
    private String unit;

    public Ingredient(String name, boolean onShoppingList, boolean required, boolean provided, String notes, double amount, String unit) {
        super(name, onShoppingList, required, provided, notes);
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                '}';
    }
}
