package com.example.Deliver.delivering.domain.services;

import com.example.Deliver.delivering.domain.model.aggregates.Product;
import com.example.Deliver.delivering.domain.model.commands.CreateProductCommand;

import java.util.Optional;

public interface ProductCommandService {

    Optional<Product> handle (CreateProductCommand command);
}
