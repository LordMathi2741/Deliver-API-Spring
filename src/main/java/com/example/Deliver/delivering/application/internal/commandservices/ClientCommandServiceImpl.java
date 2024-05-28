package com.example.Deliver.delivering.application.internal.commandservices;

import com.example.Deliver.delivering.domain.model.aggregates.Client;
import com.example.Deliver.delivering.domain.model.commands.CreateClientCommand;
import com.example.Deliver.delivering.domain.services.ClientCommandService;
import com.example.Deliver.delivering.infrastructure.persistence.jpa.ClientRepository;
import com.example.Deliver.delivering.interfaces.rest.resources.ClientResource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientCommandServiceImpl implements ClientCommandService {

    private final ClientRepository clientRepository;

    public ClientCommandServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    /**
     * ClientCommandServiceImpl
     *
     * @param command
     * @return Optional<Client>
     * @summary This method is responsible for handling the CreateClientCommand and saving the client to the database.
     */
    @Override
    public Optional<Client> handle(CreateClientCommand command) {
        if (clientRepository.existsClientByUsername(command.username())) {
            throw new IllegalArgumentException("Username already exists");
        }
        var client = new Client(command);
        var createdClient = clientRepository.save(client);
        return Optional.of(createdClient);
    }
}
