/**
 * The ClientRepository interface has the methods to interact with the database.
 * This interface is a JPA repository that extends JpaRepository and is used to interact with the database.
 * It has methods to get all clients by name and get a client by username.
 */


package com.example.Deliver.delivering.infrastructure.persistence.jpa;

import com.example.Deliver.delivering.domain.model.aggregates.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    /**
     *
     * @param name
     *  Find all clients by name in the database and return a list of clients.
     *  @return List<Client>
     */
    List<Client> findClientsByName(String name);

    @Query("SELECT c FROM Client c")
    List<Client> getAllClients();

    /**
     * @param username Find a client by username in the database and return an optional client.
     * @return Optional<Client> if the client exists, otherwise return an empty optional.
     */
    boolean existsClientByUsername(String username);

}
