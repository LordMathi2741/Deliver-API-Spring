package com.example.Deliver.delivering.interfaces.rest.resources;

public record CreateProductResource( String name, String description, String type) {

    public CreateProductResource {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("description is required");
        }
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("type is required");
        }
    }
}
