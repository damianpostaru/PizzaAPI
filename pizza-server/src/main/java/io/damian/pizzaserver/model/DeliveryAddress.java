package io.damian.pizzaserver.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class DeliveryAddress {
    @Id
    @SequenceGenerator(name = "address_sequence", sequenceName = "address_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_sequence")
    private Long id;
    private String street;
    private String city;
    private String country;
    private String zipcode;
}
