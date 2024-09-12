package com.foodapp.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "recipes")
public class Recipe {
    @Id
    private String id;
    private String name;
    private int calories;
    private int protein;
    private int carbs;
    private int fiber;
}
