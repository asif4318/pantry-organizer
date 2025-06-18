package com.asif.pantryOrganizer.repository;

import com.asif.pantryOrganizer.model.Category;
import com.asif.pantryOrganizer.model.Food;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableJpaRepositories
public interface IFoodRepository extends CrudRepository<Food, String> {
    List<Food> findByCategory(Category category);
    void deleteByName(String food);
}
