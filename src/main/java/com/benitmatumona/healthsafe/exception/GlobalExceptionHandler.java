package com.benitmatumona.healthsafe.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@RestControllerAdvice
public class GlobalExceptionHandler {



    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidationErrors(
            MethodArgumentNotValidException exception
    ){

        String message =
                exception.getBindingResult()
                .getFieldErrors()
                .get(0)
                .getDefaultMessage();


        return new ErrorResponse(
                LocalDateTime.now(),
                400,
                message
        );

    }


    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleResourceNotFound(
        ResourceNotFoundException exception
    ){

    	return new ErrorResponse(
            LocalDateTime.now(),
            404,
            exception.getMessage()
    );

}

}
