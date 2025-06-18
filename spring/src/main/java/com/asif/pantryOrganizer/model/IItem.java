package com.asif.pantryOrganizer.model;

import java.util.Date;

public interface IItem {
    void setName(String name);
    void setCategory(Category category);
    void setDescription(String description);
    void setExpiration(Date expiration);

    String getName();
    String getDescription();
    Boolean doesExpire();
    String getCategory();
}
