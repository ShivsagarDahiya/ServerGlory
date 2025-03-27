package com.satna.service;


import com.satna.exception.OrderException;
import com.satna.model.OrderItem;
import com.satna.model.Product;

public interface OrderItemService {

	OrderItem getOrderItemById(Long id) throws Exception;
	


}
