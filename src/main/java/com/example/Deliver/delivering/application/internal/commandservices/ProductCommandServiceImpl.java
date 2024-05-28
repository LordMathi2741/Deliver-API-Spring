/**
 * @summary
 * Created a ProductCommandServiceImpl class with the following attributes: productRepository.
 * This class is responsible for handling the CreateProductCommand and saving the product to the database.
 * It uses the ProductRepository to save the product.
 */


package com.example.Deliver.delivering.application.internal.commandservices;

import com.example.Deliver.delivering.domain.model.aggregates.Product;
import com.example.Deliver.delivering.domain.model.commands.CreateProductCommand;
import com.example.Deliver.delivering.domain.services.ProductCommandService;
import com.example.Deliver.delivering.infrastructure.persistence.jpa.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductCommandServiceImpl implements ProductCommandService {

    private final ProductRepository productRepository;

    public ProductCommandServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * ProductCommandServiceImpl
     * @param command
     * @summary This method is responsible for handling the CreateProductCommand and saving the product to the database.
     * @return Optional<Product>
     */

    @Override
    public Optional<Product> handle(CreateProductCommand command) {
        var product = new Product(command);
        var createdProduct = productRepository.save(product);
        return Optional.of(createdProduct);
    }
}
