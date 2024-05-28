/**
 * This class represents the command to create a product.
 * It contains the name, type and description of the product.
 * @file CreateProductCommand.java
 * @summary
 * The CreateProductCommand class is a record class that represents the command to create a product.
 */

package com.example.Deliver.delivering.domain.model.commands;

public record CreateProductCommand(String name, String type, String description) {

    /**
     * @author LordMathi2741
     * This is the constructor of the CreateProductCommand class.
     * It checks if the name, type and description are null or empty.
     * @param name This is the name of the product and cannot be null or empty
     * @param type This is the type of the product and cannot be null or empty
     * @param description This is the description of the product and cannot be null or empty
     */

    public CreateProductCommand {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("type cannot be null or empty");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("description cannot be null or empty");
        }
    }
}
