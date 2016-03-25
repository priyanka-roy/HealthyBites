package com.healthybites.service;

import com.healthybites.model.Cart;

/**
 * Created by Le on 1/25/2016.
 */
public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
