package ru.didcvee.demo1.models;

import java.util.List;

public class Order {
    private int id;
    private String clientName;
    private List<Product> products;
    private double totalPrice;
    private double totalDiscount;

    public Order(int id, String clientName, List<Product> products, double totalPrice, double totalDiscount) {
        this.id = id;
        this.clientName = clientName;
        this.products = products;
        this.totalPrice = totalPrice;
        this.totalDiscount = totalDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }


    // Getters and setters
}
