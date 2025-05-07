package BOOK_STORE;

public class Book {
    private int bookID;
    private String title;
    private double price;
    private int stock;

    // Constructor
    public Book(int bookID, String title, double price, int stock) {
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

