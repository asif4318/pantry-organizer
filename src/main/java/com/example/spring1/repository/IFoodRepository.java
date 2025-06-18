package com.example.spring1.repository;

import com.example.spring1.model.Food;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;

@EnableJpaRepositories
public interface IFoodRepository extends CrudRepository<Food, String> {
}
