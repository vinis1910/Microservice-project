package com.slloww.orderservice.handlerException;

import com.slloww.orderservice.service.exceptions.ProductUnavailableException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResourceExceptionHandler {


    @ExceptionHandler(ProductUnavailableException.class)
    public ResponseEntity<String> productUnavailable(ProductUnavailableException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }


}
