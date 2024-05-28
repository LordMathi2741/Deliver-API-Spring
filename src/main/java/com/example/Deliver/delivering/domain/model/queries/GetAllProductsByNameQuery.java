/**
 * @summary
 * This file contains the definition for the GetAllProductsByNameQuery record. This record is used to query the database for all products with a given name.
 *
 */

package com.example.Deliver.delivering.domain.model.queries;

public record GetAllProductsByNameQuery(String name) {

    public GetAllProductsByNameQuery {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }
}
