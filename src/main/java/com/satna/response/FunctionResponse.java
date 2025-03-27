package com.satna.response;

import com.satna.dto.OrderHistory;
import com.satna.model.Cart;
import com.satna.model.Order;
import com.satna.model.Product;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
