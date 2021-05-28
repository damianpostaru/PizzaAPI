package io.damian.pizzaserver.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ResponseStatus(value = NOT_FOUND)
public class NotFound extends RuntimeException {

    public NotFound(String entityName, Long id) {
        super(entityName + " with id [" + id + "] not found!");
    }
}
