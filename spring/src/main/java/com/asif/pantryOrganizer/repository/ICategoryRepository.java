package com.asif.pantryOrganizer.repository;

import com.asif.pantryOrganizer.model.Category;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;


@EnableJpaRepositories
public interface ICategoryRepository extends CrudRepository<Category, Long> {
    Category findByName(String name);
}
