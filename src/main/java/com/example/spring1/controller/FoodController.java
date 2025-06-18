package com.example.spring1.controller;

import com.example.spring1.model.Food;
import com.example.spring1.repository.IFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/food")
public class FoodController {
    @Autowired
    private IFoodRepository foodRepository;

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @PutMapping(path="/add")
    public String createFood(@RequestParam String name, @RequestParam String description, @RequestParam String category,
                             @RequestParam Boolean expirable, @RequestParam Boolean doRefrigerate) {

        Food food = new Food(name, description, expirable, category, doRefrigerate);
        foodRepository.save(food);
        return "Food created";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Food> getAllFood() {
        return foodRepository.findAll();
    }
}
