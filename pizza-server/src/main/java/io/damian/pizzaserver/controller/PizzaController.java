package io.damian.pizzaserver.controller;

import io.damian.pizzaserver.model.Pizza;
import io.damian.pizzaserver.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    private final PizzaService service;

    @Autowired
    public PizzaController(PizzaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pizza> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Pizza getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public void create(@RequestBody Pizza pizza) {
        service.create(pizza);
    }
}
