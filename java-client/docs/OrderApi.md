# OrderApi

All URIs are relative to *https://virtserver.swaggerhub.com/damianpostaru/PizzaOrder/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderCancelOrderIdPut**](OrderApi.md#orderCancelOrderIdPut) | **PUT** /order/cancel/{order_id} | 
[**orderCustomerIdGet**](OrderApi.md#orderCustomerIdGet) | **GET** /order/{customer_id} | 
[**orderDeliverytimeOrderIdGet**](OrderApi.md#orderDeliverytimeOrderIdGet) | **GET** /order/deliverytime/{order_id} | 
[**orderPost**](OrderApi.md#orderPost) | **POST** /order | 


<a name="orderCancelOrderIdPut"></a>
# **orderCancelOrderIdPut**
> Object orderCancelOrderIdPut(orderId)



Cancels an order with a given order ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Integer orderId = 56; // Integer | 
try {
    Object result = apiInstance.orderCancelOrderIdPut(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderCancelOrderIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderCustomerIdGet"></a>
# **orderCustomerIdGet**
> List&lt;Order&gt; orderCustomerIdGet(customerId)



Get the orders (order history) of a customer by the customer ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Integer customerId = 56; // Integer | 
try {
    List<Order> result = apiInstance.orderCustomerIdGet(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderCustomerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**|  |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderDeliverytimeOrderIdGet"></a>
# **orderDeliverytimeOrderIdGet**
> Object orderDeliverytimeOrderIdGet(orderId)



Gets the estimated delivery time of an order with a given order ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Integer orderId = 56; // Integer | 
try {
    Object result = apiInstance.orderDeliverytimeOrderIdGet(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderDeliverytimeOrderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderPost"></a>
# **orderPost**
> SuccesfulOrder orderPost(order)



Submits a new order to the restaurant; the format of the order is given below.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Order order = new Order(); // Order | 
try {
    SuccesfulOrder result = apiInstance.orderPost(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)|  | [optional]

### Return type

[**SuccesfulOrder**](SuccesfulOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

