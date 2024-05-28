package com.example.Deliver.delivering.interfaces.rest;

import com.example.Deliver.delivering.domain.model.aggregates.Client;
import com.example.Deliver.delivering.domain.services.ClientCommandService;
import com.example.Deliver.delivering.domain.services.ClientQueryService;
import com.example.Deliver.delivering.interfaces.rest.resources.ClientResource;
import com.example.Deliver.delivering.interfaces.rest.resources.CreateClientResource;
import com.example.Deliver.delivering.interfaces.rest.transform.ClientResourceFromEntityAssembler;
import com.example.Deliver.delivering.interfaces.rest.transform.CreateClientCommandFromResourceAssembler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.CREATED;


/**
 * @author lordmathi2741
 * @summary
 * The ClientController class is a REST controller that handles requests related to clients.
 * It has methods to create a client and get all clients.
 */
@RestController
@RequestMapping("/api/v1/delivering/clients")
public class ClientController {
    private final ClientCommandService clientCommandService;
    private final ClientQueryService clientQueryService;

    /**
     * @param clientCommandService
     * @param clientQueryService
     * The ClientController constructor initializes the clientCommandService and clientQueryService.
     */

    public ClientController(ClientCommandService clientCommandService, ClientQueryService clientQueryService) {
        this.clientCommandService = clientCommandService;
        this.clientQueryService = clientQueryService;
    }

    /**
     * @param resource
     * @return ResponseEntity<ClientResource>
     * The createFavoriteSource method creates a favorite source and returns a response entity with the created favorite source.
     */

    @PostMapping
    public ResponseEntity<ClientResource> createFavoriteSource(@RequestBody CreateClientResource resource) {
        Optional<Client> favoriteSource = clientCommandService.handle(CreateClientCommandFromResourceAssembler.toCommandFromResource(resource));
        return favoriteSource.map(source -> new ResponseEntity<>(ClientResourceFromEntityAssembler.toResourceFromEntity(source), CREATED)).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    /**
     * @return ResponseEntity<List<ClientResource>>
     * The getAllClients method returns a response entity with a list of all clients.
     */

    @GetMapping("/all")
    public ResponseEntity<List<ClientResource>> getAllClients() {
        List<Client> clients = clientQueryService.getAllClients();
        return ResponseEntity.ok(clients.stream().map(ClientResourceFromEntityAssembler::toResourceFromEntity).collect(Collectors.toList()));
    }




}
