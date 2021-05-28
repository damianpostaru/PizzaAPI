package io.damian.pizzaclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
public class SuccessfulOrder {
    private Order order;
    private OffsetDateTime orderedAt;
    private OffsetDateTime deliveryTime;
}
