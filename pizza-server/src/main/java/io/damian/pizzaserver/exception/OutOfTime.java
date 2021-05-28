package io.damian.pizzaserver.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.PRECONDITION_FAILED;

@ResponseStatus(value = PRECONDITION_FAILED)
public class OutOfTime extends RuntimeException{
    public OutOfTime() {
        super("You can't cancel your order because 5 minutes have elapsed.");
    }
}
