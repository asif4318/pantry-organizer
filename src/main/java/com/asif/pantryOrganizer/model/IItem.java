package com.asif.pantryOrganizer.model;

public interface IItem {
    String getName();
    String getDescription();
    Boolean doesExpire();
    String getCategory();
}
