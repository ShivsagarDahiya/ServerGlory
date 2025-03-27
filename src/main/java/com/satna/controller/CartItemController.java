package com.satna.controller;

import com.satna.exception.CartItemException;
import com.satna.exception.UserException;
import com.satna.model.CartItem;
import com.satna.model.User;
import com.satna.response.ApiResponse;
import com.satna.service.CartItemService;
import com.satna.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {

	private CartItemService cartItemService;
	private UserService userService;
	
	public CartItemController(CartItemService cartItemService, UserService userService) {
		this.cartItemService=cartItemService;
		this.userService=userService;
	}
	

}
