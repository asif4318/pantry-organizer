package com.asif.pantryOrganizer.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    public Category(String name) {
        this.name = name.toLowerCase();
    }

    public Category() {}

    public String getName() {
        return name;
    }

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Food> foods = new HashSet<>();

    public Long getId() {
        return id;
    }
}
