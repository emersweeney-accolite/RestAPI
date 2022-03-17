package com.emer.assignment.model;

public class IcedCoffee implements Coffee{

    private String name;
    private String category = "Iced";
    private float price;

    public IcedCoffee(String name, float price){
        this.name=name;
        this.price=price;
    }

    public String getCategory(){return category;}
    public float getPrice(){return price;}
    public String getName(){return name;}
}
