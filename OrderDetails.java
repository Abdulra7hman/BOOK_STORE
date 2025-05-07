package BOOK_STORE;

public class OrderDetails {
    private Book book;
    private Order order;
    private int quantity;

    // Constructor
    public OrderDetails(Book book, Order order, int quantity) {
        this.book = book;
        this.order = order;
        this.quantity = quantity;
    }

    // Getters
    public Book getBook() {
        return book;
    }

    public Order getOrder() {
        return order;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setBook(Book book) {
        this.book = book;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

