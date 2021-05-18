package io.damian.pizzaserver.config;

import io.damian.pizzaserver.repository.PizzaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    CommandLineRunner commandLineRunner(PizzaRepository pizzaRepository) {
        return args -> {
/*            List<Topping> toppings = new ArrayList<>();
            toppings.add(new Topping(0L, "Cheese"));
            Pizza margarita = new Pizza(0L, "margarita", true, 12.5, toppings);

            pizzaRepository.saveAll(List.of(margarita));*/
        };
    }
}
