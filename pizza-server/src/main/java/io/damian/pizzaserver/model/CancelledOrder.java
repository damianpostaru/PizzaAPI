package io.damian.pizzaserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CancelledOrder {
    private Long id;
    private String status;
}
