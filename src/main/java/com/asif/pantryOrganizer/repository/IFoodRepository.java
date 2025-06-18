package com.asif.pantryOrganizer.repository;

import com.asif.pantryOrganizer.model.Food;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface IFoodRepository extends CrudRepository<Food, String> {
}
