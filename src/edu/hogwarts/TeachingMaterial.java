package edu.hogwarts;

public abstract class TeachingMaterial {

    protected String name;
    protected boolean onShoppingList;
    protected boolean required;
    protected boolean provided;
    protected String notes;

    public TeachingMaterial() {}

    public TeachingMaterial(String name, boolean onShoppingList, boolean required, boolean provided, String notes) {
        this.name = name;
        this.onShoppingList = onShoppingList;
        this.required = required;
        this.provided = provided;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "TeachingMaterial {" +
                "\n  Name: " + name +
                "\n  On Shopping List: " + onShoppingList +
                "\n  Required: " + required +
                "\n  Provided: " + provided +
                "\n  Notes: " + notes +
                "\n}";
    }
}
