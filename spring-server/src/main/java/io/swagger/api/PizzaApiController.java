package io.swagger.api;

import io.swagger.model.Pizza;
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
public class PizzaApiController implements PizzaApi {

    private static final Logger log = LoggerFactory.getLogger(PizzaApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PizzaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Pizza>> pizzaGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pizza>>(objectMapper.readValue("[ {  \"price\" : 12.5,  \"pizza_id\" : 0,  \"name\" : \"margarita\",  \"vegetarian\" : true,  \"toppings\" : [ \"Mozzarella\", \"Tomatoes\", \"Basil\" ]}, {  \"price\" : 12.5,  \"pizza_id\" : 0,  \"name\" : \"margarita\",  \"vegetarian\" : true,  \"toppings\" : [ \"Mozzarella\", \"Tomatoes\", \"Basil\" ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pizza>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pizza>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pizza> pizzaPizzaIdGet(@ApiParam(value = "",required=true) @PathVariable("pizza_id") Integer pizzaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pizza>(objectMapper.readValue("{  \"price\" : 12.5,  \"pizza_id\" : 0,  \"name\" : \"margarita\",  \"vegetarian\" : true,  \"toppings\" : [ \"Mozzarella\", \"Tomatoes\", \"Basil\" ]}", Pizza.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pizza>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pizza>(HttpStatus.NOT_IMPLEMENTED);
    }

}
