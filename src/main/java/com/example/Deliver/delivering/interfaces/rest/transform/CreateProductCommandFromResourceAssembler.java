package com.example.Deliver.delivering.interfaces.rest.transform;

import com.example.Deliver.delivering.domain.model.commands.CreateProductCommand;
import com.example.Deliver.delivering.interfaces.rest.resources.CreateProductResource;

/**
 * Assembler class to create a CreateProductCommand from a CreateProductResource
 * <p> This assembler provides a method to convert a CreateProductResource objects to ProductCommand  command</p>
 */

public class CreateProductCommandFromResourceAssembler {

    /**
     * Converts a CreateProductResource object to a CreateProductCommand object
     * @author LordMathi2741
     * @param resource CreateProductResource object
     * @return CreateProductCommand object
     */

    public static CreateProductCommand toCommandFromResource(CreateProductResource resource){
        return new CreateProductCommand(resource.name(), resource.type(), resource.description());
    }
}
