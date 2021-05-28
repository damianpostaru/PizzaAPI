package io.damian.pizzaclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {

    private Long id;
    private String name;
    private boolean vegetarian;
    private double price;
    private List<String> toppings;
}
