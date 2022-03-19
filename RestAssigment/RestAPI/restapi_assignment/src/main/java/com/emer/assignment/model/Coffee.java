package com.emer.assignment.model;

public class Coffee implements Drink{

    private String name;
    private String category;
    private float price;

    public Coffee(String name, String category, float price){
        this.name=name;
        this.category=category;
        this.price=price;
    }

    public String getCategory(){return category;}
    public float getPrice(){return price;}
    public String getName(){return name;}
}
