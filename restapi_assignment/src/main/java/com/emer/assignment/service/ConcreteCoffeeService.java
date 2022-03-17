package com.emer.assignment.service;

import com.emer.assignment.model.Coffee;
import com.emer.assignment.model.HotCoffee;
import com.emer.assignment.model.IcedCoffee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConcreteCoffeeService implements CoffeeService {

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
                new HotCoffee("Americano", 1.5f),
                new HotCoffee("Flat_White", 2f),
                new HotCoffee("Latte", 2.5f),
                new HotCoffee("Cappucino", 2.5f),
                new HotCoffee("Mocha", 3f),
                new IcedCoffee("Iced_Latte", 3f),
                new IcedCoffee("Iced_Americano", 3f),
                new HotCoffee("Babyccino", 0.5f)
        );
    }

}

