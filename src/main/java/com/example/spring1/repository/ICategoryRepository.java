package com.example.spring1.repository;

import com.example.spring1.model.Category;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;


@EnableJpaRepositories
public interface ICategoryRepository extends CrudRepository<Category, Long> {
    Category findByName(String name);
}
