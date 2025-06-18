package com.asif.pantryOrganizer.model;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="food")
public class Food implements IItem {
    @Id
    @Column(unique=true, nullable=false)
    private String name;
    private String description;
    @Nullable
    private Date expiration;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
    private Boolean doRefrigerate;
    private ELocation location;

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public void setDoRefrigerate(Boolean doRefrigerate) {
        this.doRefrigerate = doRefrigerate;
    }

    public void setLocation(ELocation location) {
        this.location = location;
    }

    public ELocation getLocation() {
        return location;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public Date getExpiration() {
        return expiration;
    }

    public Boolean getDoRefrigerate() {
        return doRefrigerate;
    }

    @Override
    public Boolean doesExpire() {
        return expiration != null;
    }

    @Override
    public String getCategory() {
        return category.getName();
    }

    public Boolean needsRefrigeration() {
        return doRefrigerate;
    }
}
