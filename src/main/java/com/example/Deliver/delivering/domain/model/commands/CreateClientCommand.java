/**
 * This class represents the command to create a product.
 * It contains the name and the username of the client.
 * @file CreateClientCommand.java
 * @summary
 * Created a CreateClientCommand record with the following attributes: name and username.
 */


package com.example.Deliver.delivering.domain.model.commands;

public record CreateClientCommand(String name, String username) {


    /**
     * @author LordMathi2741
     * @param name This is the name of the client and cannot be null or empty
     * @param username  This is the username of the client and cannot be null or empty
     */

    public CreateClientCommand {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
    }

}
