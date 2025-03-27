package com.satna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satna.model.Cart;
import com.satna.model.CartItem;
import com.satna.model.Product;
import com.satna.model.User;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
