package com.kpopshop.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Annotation to specify MongoDB collection
@Document(collection = "Category")
@Data // Lombok annotation for generating getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Lombok annotation to generate constructor with all arguments
@NoArgsConstructor // Lombok annotation to generate constructor with no arguments
public class Category {

    // MongoDB document ID
    @Id
    private String categoryId;

    // Name of the category
    private String name;
}