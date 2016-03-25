package com.healthybites.dao;

import com.healthybites.model.Cart;

import java.io.IOException;

/**
 * Created by Le on 1/11/2016.
 */
public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
