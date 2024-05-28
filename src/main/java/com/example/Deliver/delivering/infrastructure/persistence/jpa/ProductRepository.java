package com.example.Deliver.delivering.infrastructure.persistence.jpa;

import com.example.Deliver.delivering.domain.model.aggregates.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * The ProductRepository interface has the methods to interact with the database.
     * This interface is a JPA repository that extends JpaRepository and is used to interact with the database.
     * It has methods to get all products by name and get a product by name.
     */

    /**
     *
     * @param name
     *  Find all products by name in the database and return a list of products.
     *  @return List<Product>
     */
    List<Product> findProductsByName(String name);

    /**
     *
     * @param type
     *  Find all products by type in the database and return a list of products.
     *  @return List<Product>
     */
    List<Product> findProductsByType(String type);
}
