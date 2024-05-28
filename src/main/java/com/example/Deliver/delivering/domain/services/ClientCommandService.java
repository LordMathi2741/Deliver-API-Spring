package com.example.Deliver.delivering.domain.services;

import com.example.Deliver.delivering.domain.model.aggregates.Client;
import com.example.Deliver.delivering.domain.model.commands.CreateClientCommand;

import java.util.Optional;


public interface ClientCommandService {

    Optional<Client> handle (CreateClientCommand command);
}
