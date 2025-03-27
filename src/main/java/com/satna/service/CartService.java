package com.satna.service;

import com.satna.exception.ProductException;
import com.satna.model.Cart;
import com.satna.model.CartItem;
import com.satna.model.Product;
import com.satna.model.User;
import com.satna.request.AddItemRequest;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
