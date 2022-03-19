package com.emer.assignment.service;

import com.emer.assignment.model.Coffee;

import java.util.List;

public interface CoffeeService {
    public Coffee getCoffee(String name);
    public List<Coffee> getCoffeeMenu();
    public List<Coffee> getCoffeesByCategory(String category);
}