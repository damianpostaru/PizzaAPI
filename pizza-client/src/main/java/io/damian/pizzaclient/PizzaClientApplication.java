package io.damian.pizzaclient;

import io.damian.pizzaclient.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class PizzaClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PizzaClientApplication.class, args);
    }

    private final String baseUrl = "http://localhost:8080/api/v1";
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public void run(String... args) {
        System.out.println("Get all pizzas: ");
        for (Pizza pizza : getPizzas()) {
            System.out.println(pizza);
        }
        System.out.println();

        System.out.println("Successful Order: ");
        System.out.println(createOrder());
        System.out.println();

        int pizzaId = 2;
        System.out.println("Pizza with id " + pizzaId+ " :");
        try {
            System.out.println(getPizzaById(pizzaId));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        int orderId = 2;
        System.out.println("Order with id 1: ");
        try {
            System.out.println(getOrderById(orderId));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("Cancel order with id " + orderId + " :");
        try {
            System.out.println(cancelOrder(orderId));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("Delivery time for order with id " + orderId + " :");
        System.out.println(getDeliveryTime(orderId));
        System.out.println();
    }

    private SuccessfulOrder createOrder() {
        Order order = new Order(3009L, true, "Cash", new DeliveryAddress("Good street", "Maastricht", "Netherlands", "1234XD"), Arrays.asList(1, 3, 4), "A lot of pickles");
        String createOrderUrl = baseUrl + "/order";
        return restTemplate.postForObject(createOrderUrl, order, SuccessfulOrder.class);
    }

    private OffsetDateTime getDeliveryTime(int id) {
        String getByIdUrl = baseUrl + "/order/deliverytime/{id}";
        Map<String, String> params = new HashMap<>();
        params.put("id", id + "");
        return restTemplate.getForObject(getByIdUrl, OffsetDateTime.class, params);
    }

    private Order getOrderById(int id) {
        String getByIdUrl = baseUrl + "/order/{id}";
        Map<String, String> params = new HashMap<>();
        params.put("id", id + "");
        return restTemplate.getForObject(getByIdUrl, Order.class, params);
    }

    private CancelledOrder cancelOrder(int id){
        String getByIdUrl = baseUrl + "/order/cancel/{id}";
        Map<String, String> params = new HashMap<>();
        params.put("id", id + "");
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<CancelledOrder> requestEntity = new HttpEntity<>(headers);
        return restTemplate.exchange(getByIdUrl, HttpMethod.PUT, requestEntity, CancelledOrder.class, params).getBody();
    }

    private Pizza[] getPizzas() {
        String getPizzasUrl = baseUrl + "/pizza";
        ResponseEntity<Pizza[]> response = restTemplate.getForEntity(getPizzasUrl, Pizza[].class);
        return response.getBody();
    }

    private Pizza getPizzaById(int id) {
        String getByIdUrl = baseUrl + "/pizza/{id}";
        Map<String, String> params = new HashMap<>();
        params.put("id", id + "");
        return restTemplate.getForObject(getByIdUrl, Pizza.class, params);
    }


}
