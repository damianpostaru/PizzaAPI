package io.damian.pizzaserver.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@ResponseStatus(value = UNPROCESSABLE_ENTITY)
public class AlreadyCancelled extends RuntimeException{
    public AlreadyCancelled() {
        super("Order already cancelled or delivered.");
    }
}
