package com.slloww.orderservice.DTOs;

import com.slloww.orderservice.models.OrderLineItems;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {

    private String orderNumber;
    private List<OrderLineItems> orderLineItemsList;
}
