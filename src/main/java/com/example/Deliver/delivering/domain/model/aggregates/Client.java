/**
 * Client
 * @summary
 * Created a Client class with the following attributes: id, name, and username.
 */

package com.example.Deliver.delivering.domain.model.aggregates;

import com.example.Deliver.delivering.domain.model.commands.CreateClientCommand;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.domain.AbstractAggregateRoot;


@Entity
public class Client extends AbstractAggregateRoot<Client> {
    /**
        The id attribute is annotated with @Id and @GeneratedValue(strategy = GenerationType.IDENTITY).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    /**
        The name and username attributes are annotated with @Column(nullable = false) and @Getter. The name attribute is of type String and the username attribute is of type String.
     */
    @Column(nullable = false)
    @Getter
    private String name;

    @Column(nullable = false)
    @Getter
    private String username;

    protected Client(){

        /**
         * The default constructor is protected to avoid direct instantiation.
         */
    }

    public Client(CreateClientCommand command) {
        this.name = command.name();
        this.username = command.username();
    }


}
