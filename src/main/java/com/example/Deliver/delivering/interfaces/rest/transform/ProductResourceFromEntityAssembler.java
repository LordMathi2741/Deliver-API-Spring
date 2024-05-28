package com.example.Deliver.delivering.interfaces.rest.transform;

import com.example.Deliver.delivering.domain.model.aggregates.Product;
import com.example.Deliver.delivering.interfaces.rest.resources.ProductResource;

public class ProductResourceFromEntityAssembler {

    public static ProductResource toResourceFromEntity(Product entity){
        return new ProductResource(entity.getId(), entity.getName(), entity.getType(), entity.getDescription());
    }
}
