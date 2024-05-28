package com.example.Deliver.delivering.application.internal.queryservices;

import com.example.Deliver.delivering.domain.model.aggregates.Product;
import com.example.Deliver.delivering.domain.model.queries.GetAllProductsByNameQuery;
import com.example.Deliver.delivering.domain.model.queries.GetAllProductsByTypeQuery;
import com.example.Deliver.delivering.domain.services.ProductQueryService;
import com.example.Deliver.delivering.infrastructure.persistence.jpa.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductQueryServiceImpl implements ProductQueryService {

    private final ProductRepository productRepository;

    public ProductQueryServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> handle(GetAllProductsByNameQuery query) {
        return productRepository.findProductsByName(query.name());
    }

    @Override
    public List<Product> handle(GetAllProductsByTypeQuery query) {
        return productRepository.findProductsByType(query.type());
    }
}
