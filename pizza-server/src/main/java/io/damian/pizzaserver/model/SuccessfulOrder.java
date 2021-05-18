package io.damian.pizzaserver.model;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class SuccessfulOrder {
    private final Order order;
    private final OffsetDateTime orderedAt;
    private final OffsetDateTime deliveryTime;
}
