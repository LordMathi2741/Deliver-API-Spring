/**
 * @summary
 * This file contains the definition for the GetAllProductsByTypeQuery record. This record is used to query the database for all products with a given type.
 */

package com.example.Deliver.delivering.domain.model.queries;

public record GetAllProductsByTypeQuery(String type) {

    public GetAllProductsByTypeQuery {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
    }

}
