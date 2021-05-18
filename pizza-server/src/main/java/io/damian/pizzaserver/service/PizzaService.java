package io.damian.pizzaserver.service;

import io.damian.pizzaserver.exception.NotFound;
import io.damian.pizzaserver.model.Pizza;
import io.damian.pizzaserver.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {

    private final PizzaRepository repository;

    @Autowired
    public PizzaService(PizzaRepository repository) {
        this.repository = repository;
    }

    public List<Pizza> getAll() {
        return repository.findAll();
    }

    public void create(Pizza pizza) {
        repository.save(pizza);
    }

    public Pizza getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFound("Pizza", id));
    }
}
