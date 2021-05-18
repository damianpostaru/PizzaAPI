package io.damian.pizzaserver.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pizza {

    @Id
    @SequenceGenerator(
            name = "pizza_sequence",
            sequenceName = "pizza_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pizza_sequence"
    )
    private Long id;
    @Column(unique=true)
    private String name;
    private boolean vegetarian;
    private double price;
    @ElementCollection
    @CollectionTable(name = "pizza_toppings")
    @Column(name = "topping")
    private List<String> toppings;
}
