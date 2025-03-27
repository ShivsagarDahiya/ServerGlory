package com.satna.service;

import com.satna.exception.CartItemException;
import com.satna.exception.UserException;
import com.satna.model.Cart;
import com.satna.model.CartItem;
import com.satna.model.Product;


public interface CartItemService {
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
