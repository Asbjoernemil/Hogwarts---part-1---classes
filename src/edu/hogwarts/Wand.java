package edu.hogwarts;

public class Wand extends TeachingMaterial {
    private double lengthInInches;
    private String wood;
    private String core;

    public Wand(String name, boolean onShoppingList, boolean required, boolean provided, String notes,
                double lengthInInches, String wood, String core) {

        super(name, onShoppingList, required, provided, notes);
        this.lengthInInches = lengthInInches;
        this.wood = wood;
        this.core = core;
    }

    public Wand(double lengthInInches, String wood, String core) {
        this.lengthInInches = lengthInInches;
        this.wood = wood;
        this.core = core;
    }

    @Override
    public String toString() {
        return "Wand{" +
                "lengthInInches=" + lengthInInches +
                ", wood='" + wood + '\'' +
                ", core='" + core + '\'' +
                '}';
    }
}
