package com.example.Deliver.delivering.interfaces.rest.transform;

import com.example.Deliver.delivering.domain.model.commands.CreateClientCommand;
import com.example.Deliver.delivering.interfaces.rest.resources.CreateClientResource;

/**
 * Assembler class to create a CreateClientCommand from a CreateClientResource
 * <p> This assembler provides a method to convert a CreateClientResource objects to ClientCommand  command</p>
 */

public class CreateClientCommandFromResourceAssembler {

    /**
     * Converts a CreateClientResource object to a CreateClientCommand object
     * @author LordMathi2741
     * @param resource CreateClientResource object
     * @return CreateClientCommand object
     */

    public static CreateClientCommand toCommandFromResource(CreateClientResource resource){
        return new CreateClientCommand(resource.name(), resource.username());
    }

}
