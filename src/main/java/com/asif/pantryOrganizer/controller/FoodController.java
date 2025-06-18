package com.asif.pantryOrganizer.controller;

import com.asif.pantryOrganizer.model.Category;
import com.asif.pantryOrganizer.model.ELocation;
import com.asif.pantryOrganizer.model.Food;
import com.asif.pantryOrganizer.repository.ICategoryRepository;
import com.asif.pantryOrganizer.repository.IFoodRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/food")
public class FoodController {
    @Autowired
    private IFoodRepository foodRepository;
    @Autowired
    private ICategoryRepository categoryRepository;

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @PutMapping(path = "/add")
    public String createFood(@RequestParam String name, @RequestParam String description, @RequestParam String category,
                             @RequestParam Optional<Date> expiration, @RequestParam Boolean refrigerate, @RequestParam String location) {
        Food newFood = new Food();
        newFood.setName(name.toLowerCase());
        newFood.setDescription(description);
        expiration.ifPresent(newFood::setExpiration);
        newFood.setDoRefrigerate(refrigerate);
        newFood.setLocation(ELocation.valueOf(location.toUpperCase()));

        Category existing = categoryRepository.findByName(category.toLowerCase());
        if (existing != null) {
            newFood.setCategory(existing);
        } else {
            Category temp = new Category(category);
            categoryRepository.save(temp);
            newFood.setCategory(temp);
        }

        foodRepository.save(newFood);

        return "Food created";
    }

    @GetMapping("/category")
    public List<Food> findAllByCategory(String name) {
        Category category = categoryRepository.findByName(name.toLowerCase());
        return foodRepository.findByCategory(category);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Food> getAllFood() {
        return foodRepository.findAll();
    }

    @DeleteMapping(path="/remove")
    @Transactional
    public String deleteFood(@RequestParam String name) {
        foodRepository.deleteByName(name.toLowerCase());
        return "Food deleted";
    }
}
