package com.emer.assignment.controller;

import com.emer.assignment.model.Coffee;
import com.emer.assignment.model.HotCoffee;
import com.emer.assignment.service.CoffeeService;
import com.emer.assignment.service.ConcreteCoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("coffee-shop")
public class CoffeeController {

    @GetMapping("/welcome")
    public String sayHello(){return "Welcome to The Coffee Shop!";}

    @Autowired
    ConcreteCoffeeService coffeeService;

    // /coffee-shop/coffee
    // /coffee-shop/coffee?name=americano
    @GetMapping("/coffee")
    public Coffee getCoffee(@RequestParam(value="name", required = false) String name){
        Coffee coffee = coffeeService.getCoffee(name);
        return coffee;
    }

//    @RequestMapping("/coffee")
////    @ResponseBody
//    public String getCoffee(@RequestParam(value="name") String name){return "coffee";}

    // /coffee-shop/coffees
    // /coffee-shop/coffees?category=Iced
    @GetMapping("/coffees")
    public List<Coffee> getCoffeesByCategory(@RequestParam(value="category", required=false) String category){
        return coffeeService.getCoffeesByCategory(category);
    }

}