package com.example.Deliver.delivering.domain.services;

import com.example.Deliver.delivering.domain.model.aggregates.Client;
import com.example.Deliver.delivering.domain.model.queries.GetAllClientsByNameQuery;

import java.util.List;
import java.util.Optional;

public interface ClientQueryService {

    List<Client> handle (GetAllClientsByNameQuery query);
    List<Client> getAllClients();

}
