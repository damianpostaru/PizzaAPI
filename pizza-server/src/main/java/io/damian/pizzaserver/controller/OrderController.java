package io.damian.pizzaserver.controller;

import io.damian.pizzaserver.model.CancelledOrder;
import io.damian.pizzaserver.model.Order;
import io.damian.pizzaserver.model.SuccessfulOrder;
import io.damian.pizzaserver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/order")
public class OrderController {

    OrderService service;

    @Autowired
    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public SuccessfulOrder create(@RequestBody Order order) {
        service.create(order);
        return new SuccessfulOrder(order, OffsetDateTime.now(), OffsetDateTime.now().plusMinutes(45));
    }

    @PutMapping("/cancel/{id}")
    public CancelledOrder cancel(@PathVariable Long id) {
        service.cancel(id);
        return new CancelledOrder(id, "Cancelled");
    }

    @GetMapping("/deliverytime/{id}")
    public OffsetDateTime getDeliveryTime(@PathVariable Long id) {
        return service.getDeliveryTime(id);
    }
}
