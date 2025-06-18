package com.asif.pantryOrganizer.model;
import jakarta.persistence.*;

@Entity
@Table(name="food")
public class Food implements IItem {
    @Id
    private String name;
    private String description;
    private Boolean expirable;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="category_id")
    private Category category;
    private Boolean doRefrigerate;

    public void setCategory(Category category) {
        this.category = category;
    }

    public Food(String name, String description, Boolean expirable, String category, Boolean doRefrigerate) {
        this.name = name;
        this.description = description;
        this.expirable = expirable;
        this.category = new Category(category);
        this.doRefrigerate = doRefrigerate;
    }

    public Food() {
        this.name = "Food";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Boolean doesExpire() {
        return expirable;
    }

    @Override
    public String getCategory() {
        return category.getName();
    }

    public Boolean needsRefrigeration() {
        return doRefrigerate;
    }
}
