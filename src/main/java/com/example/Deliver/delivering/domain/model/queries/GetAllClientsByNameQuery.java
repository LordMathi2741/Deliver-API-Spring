/**
 * GetAllClientsByNameQuery
 * @summary
 * This file contains the definition for the GetAllClientsByNameQuery record. This record is used to query the database for all clients with a given name.
 *
 */

package com.example.Deliver.delivering.domain.model.queries;

public record GetAllClientsByNameQuery(String name) {


    public GetAllClientsByNameQuery {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }
}
