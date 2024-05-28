package com.example.Deliver.delivering.application.internal.queryservices;

import com.example.Deliver.delivering.domain.model.aggregates.Client;
import com.example.Deliver.delivering.domain.model.queries.GetAllClientsByNameQuery;
import com.example.Deliver.delivering.domain.services.ClientQueryService;
import com.example.Deliver.delivering.infrastructure.persistence.jpa.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientQueryServiceImpl implements ClientQueryService {
    private final ClientRepository clientRepository;

    public ClientQueryServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    @Override
    public List<Client> handle(GetAllClientsByNameQuery query) {
        return clientRepository.findClientsByName(query.name());
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.getAllClients();
    }

}
