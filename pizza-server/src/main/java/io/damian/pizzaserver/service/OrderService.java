package io.damian.pizzaserver.service;

import io.damian.pizzaserver.exception.AlreadyCancelled;
import io.damian.pizzaserver.exception.NotFound;
import io.damian.pizzaserver.exception.OutOfTime;
import io.damian.pizzaserver.model.Order;
import io.damian.pizzaserver.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> getOrders() {
        return repository.findAll();
    }

    public Order getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFound("Order", id));
    }

    public void create(Order order) {
        repository.save(order);
    }

    public void cancel(Long id) {
        Order order = repository.findById(id).orElseThrow(() -> new NotFound("Order", id));
        if (Duration.between(OffsetDateTime.now(), order.getOrderedAt()).toMinutes() > 5) {
            throw new OutOfTime();
        }
        if (order.getStatus().equals("Cancelled") || order.getStatus().equals("Delivered")) {
            throw new AlreadyCancelled();
        }
        order.setStatus("Cancelled");
        repository.save(order);
    }

    public OffsetDateTime getDeliveryTime(Long id) {
        Order order = repository.findById(id).orElseThrow(() -> new NotFound("Order", id));
        return order.getOrderedAt().plusMinutes(45);
    }
}
