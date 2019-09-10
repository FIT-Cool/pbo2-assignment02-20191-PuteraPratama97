package com.putera.entity;

public class Item {
    private String Name;
    private Double Price;

    public String getName() {
        return Name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(Double price) {
        this.Price = price;
    }
}
