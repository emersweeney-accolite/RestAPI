package com.emer.assignment.model;

public class HotCoffee implements Coffee{

    private String name;
    private String category = "Hot";
    private float price;

    public HotCoffee(String name, float price){
        this.name=name;
        this.price=price;
    }

    public String getCategory(){return category;}
    public float getPrice(){return price;}
    public String getName(){return name;}
}
