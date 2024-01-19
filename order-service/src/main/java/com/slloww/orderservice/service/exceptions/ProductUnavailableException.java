package com.slloww.orderservice.service.exceptions;

public class ProductUnavailableException extends RuntimeException {

    public ProductUnavailableException() {
        super("Product is not in stock, please try again later");
    }

}
