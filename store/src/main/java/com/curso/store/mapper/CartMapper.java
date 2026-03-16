package com.curso.store.mapper;

import com.curso.store.domains.Cart;
import com.curso.store.dto.CartDTO;

public class CartMapper {

    public static Cart toEntity(CartDTO dto) {

        Cart cart = new Cart();

        cart.setUserId(dto.getUserId());
        cart.setProductIds(dto.getProductIds());
        cart.setTotal(dto.getTotal());

        return cart;
    }
}