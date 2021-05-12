package io.swagger.api;

import io.swagger.model.Order;
import io.swagger.model.SuccesfulOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-12T12:36:09.273Z")

@Controller
public class OrderApiController implements OrderApi {

    private static final Logger log = LoggerFactory.getLogger(OrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> orderCancelOrderIdPut(@ApiParam(value = "",required=true) @PathVariable("order_id") Integer orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("\"{}\"", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Order>> orderCustomerIdGet(@ApiParam(value = "",required=true) @PathVariable("customer_id") Integer customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Order>>(objectMapper.readValue("[ {  \"note\" : \"No Onions\",  \"payment_type\" : \"cash\",  \"delivery_address\" : \"{}\",  \"pizzas\" : [ 5, 3, 3, 7, 2 ],  \"ordered_at\" : \"2012-04-23T18:05:32.511Z\",  \"id\" : 1,  \"customer_id\" : 123456,  \"takeaway\" : false,  \"status\" : \"In Progress\"}, {  \"note\" : \"No Onions\",  \"payment_type\" : \"cash\",  \"delivery_address\" : \"{}\",  \"pizzas\" : [ 5, 3, 3, 7, 2 ],  \"ordered_at\" : \"2012-04-23T18:05:32.511Z\",  \"id\" : 1,  \"customer_id\" : 123456,  \"takeaway\" : false,  \"status\" : \"In Progress\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Order>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Order>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> orderDeliverytimeOrderIdGet(@ApiParam(value = "",required=true) @PathVariable("order_id") Integer orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("\"{}\"", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SuccesfulOrder> orderPost(@ApiParam(value = ""  )  @Valid @RequestBody Order order) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SuccesfulOrder>(objectMapper.readValue("{  \"ordered_at\" : \"2012-04-23T18:05:32.511Z\",  \"delivery_time\" : \"2012-04-23T18:25:43.511Z\",  \"order\" : {    \"note\" : \"No Onions\",    \"payment_type\" : \"cash\",    \"delivery_address\" : \"{}\",    \"pizzas\" : [ 5, 3, 3, 7, 2 ],    \"ordered_at\" : \"2012-04-23T18:05:32.511Z\",    \"id\" : 1,    \"customer_id\" : 123456,    \"takeaway\" : false,    \"status\" : \"In Progress\"  }}", SuccesfulOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SuccesfulOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SuccesfulOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

}
