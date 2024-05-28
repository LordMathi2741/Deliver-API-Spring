package com.example.Deliver.delivering.domain.services;

import com.example.Deliver.delivering.domain.model.aggregates.Product;
import com.example.Deliver.delivering.domain.model.queries.GetAllProductsByNameQuery;
import com.example.Deliver.delivering.domain.model.queries.GetAllProductsByTypeQuery;

import java.util.List;

public interface ProductQueryService {
    List<Product> handle (GetAllProductsByNameQuery query);
    List<Product> handle (GetAllProductsByTypeQuery query);
}
