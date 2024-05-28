
/**
 * Product
 * @summary
 *Created a Product class with the following attributes: id, name, type, and description.
 */

package com.example.Deliver.delivering.domain.model.aggregates;

import com.example.Deliver.delivering.domain.model.commands.CreateProductCommand;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class Product {

    /**
        The id attribute is annotated with @Id and @GeneratedValue(strategy = GenerationType.IDENTITY).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    /**
        The name, type, and description attributes are annotated with @Column(nullable = false) and @Getter. The name attribute is of type String, the type attribute is of type String, and the description attribute is of type String.
     */

    @Column(nullable = false)
    @Getter
    private String name;

    /**
     * The type attribute is of type String.
     */

    @Column(nullable = false)
    @Getter
    private String type;

    /**
     * The description attribute is of type String.
     */

    @Column(nullable = false)
    @Getter
    private String description;


    /** The date and time when the favorite source was created. */
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdAt;

    /** The date and time when the favorite source was last updated. */
    @LastModifiedDate
    @Column(nullable = false)
    private Date updatedAt;


    protected Product(){

        /**
         * The default constructor is protected to avoid direct instantiation.
         */
    }

    /**
     * The Product class has a constructor that takes a CreateProductCommand object as an argument.
     * The constructor initializes the name, type, and description attributes with the values from the CreateProductCommand object.
     * @param command
     */

    public Product(CreateProductCommand command) {
        this.name = command.name();
        this.type = command.type();
        this.description = command.description();
    }

}
