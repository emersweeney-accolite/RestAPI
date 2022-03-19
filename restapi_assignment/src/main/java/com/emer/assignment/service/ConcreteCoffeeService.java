package com.emer.assignment.service;

import com.emer.assignment.model.Coffee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConcreteCoffeeService implements CoffeeService {

    ArrayList<Coffee> coffeeMenu = new ArrayList<>();

    @Override
    public Coffee getCoffee(String name) {
        return getCoffeeMenu()
                .stream()
                .filter((coffee)->coffee.getName().equalsIgnoreCase(name))
                .findAny()
                .get();
    }

    @Override
    public List<Coffee> getCoffeesByCategory(String category) {
        return getCoffeeMenu()
                .stream()
                .filter((coffee -> coffee.getCategory().equalsIgnoreCase(category)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Coffee> getCoffeeMenu(){
        return Arrays.asList(
                new Coffee("Americano", "Coffee", 1.5f),
                new Coffee("Flat_White", "Coffee", 2f),
                new Coffee("Latte", "Coffee", 2.5f),
                new Coffee("Cappucino", "Coffee", 2.5f),
                new Coffee("Mocha", "Coffee", 3f),
                new Coffee("Iced_Latte", "Iced_Coffee",  3f),
                new Coffee("Iced_Americano", "Iced_Coffee", 3f),
                new Coffee("Babyccino", "Childrens_Drink", 0.5f)
        );
    }

}

