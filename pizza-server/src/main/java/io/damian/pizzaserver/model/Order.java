package io.damian.pizzaserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Order {

    @Id
    @SequenceGenerator(name = "order_sequence", sequenceName = "order_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
    private Long id;

    @JsonProperty("customer_id")
    private Long customerId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("ordered_at")
    private OffsetDateTime orderedAt;

    @JsonProperty("takeaway")
    private boolean takeaway;

    @JsonProperty("payment_type")
    private String paymentType;

    @JsonProperty("delivery_address")
    @ManyToOne(cascade= ALL)
    private DeliveryAddress deliveryAddress;

    @ElementCollection
    @CollectionTable(name = "order_pizzas")
    @Column(name = "pizzas")
    @JsonProperty("pizzas")
    private List<Integer> pizzas;

    @JsonProperty("note")
    private String note;
}
