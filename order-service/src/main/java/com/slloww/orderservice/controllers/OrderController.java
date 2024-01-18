package com.slloww.orderservice.controllers;

import com.slloww.orderservice.DTOs.OrderRequest;
import com.slloww.orderservice.DTOs.OrderResponse;
import com.slloww.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.PlaceOrder(orderRequest);
        return "Order Placed Successfully";
    }

    @GetMapping
    public List<OrderResponse> findAll(){
        return orderService.findAll();
    }

}
