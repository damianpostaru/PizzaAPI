package io.damian.pizzaclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;
    @JsonProperty("customer_id")
    private Long customerId;
    private String status;
    @JsonProperty("ordered_at")
    private OffsetDateTime orderedAt;
    private boolean takeaway;
    @JsonProperty("payment_type")
    private String paymentType;
    @JsonProperty("delivery_address")
    private DeliveryAddress deliveryAddress;
    private List<Integer> pizzas;
    private String note;

    public Order(Long customerId, boolean takeaway, String paymentType, DeliveryAddress deliveryAddress, List<Integer> pizzas, String note) {
        this.customerId = customerId;
        this.takeaway = takeaway;
        this.paymentType = paymentType;
        this.deliveryAddress = deliveryAddress;
        this.pizzas = pizzas;
        this.note = note;
    }
}
