package BOOK_STORE;

import java.util.Date;

import java.util.Date;

public class Order {
    private int orderID;
    private Date orderDate; 

    // Relationship: each order is made by one customer
    private Customer customer;

    // Constructor
    public Order(int orderID, Date orderDate, Customer customer) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    // Getters
    public int getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    // Setters
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

