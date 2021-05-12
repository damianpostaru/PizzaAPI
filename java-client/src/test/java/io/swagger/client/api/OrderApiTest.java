/*
 * Pizza API
 * Assignment 6 Pizza Ordering
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Order;
import io.swagger.client.model.SuccesfulOrder;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderApi
 */
@Ignore
public class OrderApiTest {

    private final OrderApi api = new OrderApi();

    
    /**
     * 
     *
     * Cancels an order with a given order ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderCancelOrderIdPutTest() throws ApiException {
        Integer orderId = null;
        Object response = api.orderCancelOrderIdPut(orderId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the orders (order history) of a customer by the customer ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderCustomerIdGetTest() throws ApiException {
        Integer customerId = null;
        List<Order> response = api.orderCustomerIdGet(customerId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets the estimated delivery time of an order with a given order ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderDeliverytimeOrderIdGetTest() throws ApiException {
        Integer orderId = null;
        Object response = api.orderDeliverytimeOrderIdGet(orderId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Submits a new order to the restaurant; the format of the order is given below.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderPostTest() throws ApiException {
        Order order = null;
        SuccesfulOrder response = api.orderPost(order);

        // TODO: test validations
    }
    
}