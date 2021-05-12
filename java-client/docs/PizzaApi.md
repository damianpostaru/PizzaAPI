# PizzaApi

All URIs are relative to *https://virtserver.swaggerhub.com/damianpostaru/PizzaOrder/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pizzaGet**](PizzaApi.md#pizzaGet) | **GET** /pizza | 
[**pizzaPizzaIdGet**](PizzaApi.md#pizzaPizzaIdGet) | **GET** /pizza/{pizza_id} | 


<a name="pizzaGet"></a>
# **pizzaGet**
> List&lt;Pizza&gt; pizzaGet()



Returns all pizzas that the restaurant offers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PizzaApi;


PizzaApi apiInstance = new PizzaApi();
try {
    List<Pizza> result = apiInstance.pizzaGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PizzaApi#pizzaGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Pizza&gt;**](Pizza.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pizzaPizzaIdGet"></a>
# **pizzaPizzaIdGet**
> Pizza pizzaPizzaIdGet(pizzaId)



Find a pizza by ID (return toppings in pizza, price and if it is vegetarian or not).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PizzaApi;


PizzaApi apiInstance = new PizzaApi();
Integer pizzaId = 56; // Integer | 
try {
    Pizza result = apiInstance.pizzaPizzaIdGet(pizzaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PizzaApi#pizzaPizzaIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pizzaId** | **Integer**|  |

### Return type

[**Pizza**](Pizza.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

