package com.asif.pantryOrganizer.controller;

import com.asif.pantryOrganizer.model.Food;
import com.asif.pantryOrganizer.repository.IFoodRepository;
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
