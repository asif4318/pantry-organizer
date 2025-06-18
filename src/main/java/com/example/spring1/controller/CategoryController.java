package com.example.spring1.controller;

import com.example.spring1.model.Category;
import com.example.spring1.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryRepository categoryRepository;

    @PutMapping("/add")
    public @ResponseBody Category add(@RequestParam String name) {
        Category newCategory = new Category(name.toLowerCase());
        categoryRepository.save(newCategory);
        return newCategory;
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Category> getAll() {
        return categoryRepository.findAll();
    }

    @GetMapping("/get")
    public @ResponseBody Category findOne(@RequestParam String name) {
        return categoryRepository.findByName(name);
    }

}
