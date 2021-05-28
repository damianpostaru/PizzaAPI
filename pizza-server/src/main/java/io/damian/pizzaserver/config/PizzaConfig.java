package io.damian.pizzaserver.config;

import io.damian.pizzaserver.model.Pizza;
import io.damian.pizzaserver.repository.PizzaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaConfig {

    CommandLineRunner commandLineRunner(PizzaRepository repository) {
        return args -> {
            if (repository.findAll().size() == 0) {
                Pizza margarita = new Pizza(1L, "margarita", true, 12.5, List.of("Mozzarella", "Tomatoes", "Basil"));
                Pizza fourCheese = new Pizza(2L, "four cheese", true, 12.5, List.of("Crème fraîche", "Mozzarella", "Goat cheese", "Emmental", "Gorgonzola"));
                Pizza bbqChickenBacon = new Pizza(3L, "bbq chicken & bacon", false, 11.5, List.of("BBQ sauce", "Mozzarella", "Grilled chicken", "Bacon"));

                repository.saveAll(List.of(margarita, fourCheese, bbqChickenBacon));
            }
        };
    }
}
