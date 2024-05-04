package com.example;

public class Product {

    public Product(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    private final Double price;
    private final String name;

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

