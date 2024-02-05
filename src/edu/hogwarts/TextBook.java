package edu.hogwarts;

public class TextBook extends TeachingMaterial {
    private String title;
    private String author;
    private String publisher;
    private int publishedYear;

    public TextBook(String name, boolean onShoppingList, boolean required, boolean provided,
                    String notes, String title, String author, String publisher, int publishedYear) {

        super(name, onShoppingList, required, provided, notes);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return
                "Teaching material" +
                        "\n  Title: " + title +
                        "\n  Author: " + author +
                        "\n  Publisher: " + publisher +
                        "\n  Published Year: " + publishedYear +
                        "\n}";
    }
}
