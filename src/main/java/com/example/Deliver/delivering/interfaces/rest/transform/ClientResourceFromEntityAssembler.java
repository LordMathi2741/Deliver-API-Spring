package com.example.Deliver.delivering.interfaces.rest.transform;

import com.example.Deliver.delivering.domain.model.aggregates.Client;
import com.example.Deliver.delivering.interfaces.rest.resources.ClientResource;

public class ClientResourceFromEntityAssembler {

    public static ClientResource toResourceFromEntity(Client entity){
        return new ClientResource(entity.getId(),entity.getName(), entity.getUsername());
    }
}
