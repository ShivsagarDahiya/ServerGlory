package com.satna.service;


import com.satna.exception.WishlistNotFoundException;
import com.satna.model.Product;
import com.satna.model.User;
import com.satna.model.Wishlist;

import java.util.Optional;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

