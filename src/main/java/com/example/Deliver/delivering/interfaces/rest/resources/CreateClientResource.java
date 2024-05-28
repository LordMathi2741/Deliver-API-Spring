package com.example.Deliver.delivering.interfaces.rest.resources;

public record CreateClientResource(String name, String username) {
    public CreateClientResource {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("username is required");
        }
    }
}
