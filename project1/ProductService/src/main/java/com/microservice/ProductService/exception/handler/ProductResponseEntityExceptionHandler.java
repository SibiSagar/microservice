package com.microservice.ProductService.exception.handler;

import com.microservice.ProductService.exception.ProductNotFoundException;
import com.microservice.ProductService.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ProductResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> ProductNotFoundExceptionHandler(ProductNotFoundException productNotFoundException){

        return new ResponseEntity<>(
                ErrorResponse.builder()
                .errorMessage(productNotFoundException.getMessage())
                .errorCode(productNotFoundException.getErrorCode())
                .build(), HttpStatus.NOT_FOUND);

    }
}
