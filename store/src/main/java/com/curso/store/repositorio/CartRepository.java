package com.curso.store.repositorio;

import com.curso.store.domains.Cart;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CartRepository {

    private final List<Cart> carts = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cart> list() {
        return carts;
    }

    public Cart save(Cart cart) {
        cart.setId(nextId);
        nextId++;
        carts.add(cart);
        return cart;
    }

    public Cart update(Long id, Cart updatedCart) {
        for (Cart cart : carts) {
            if (cart.getId().equals(id)) {
                cart.setUserId(updatedCart.getUserId());
                cart.setProductIds(updatedCart.getProductIds());
                cart.setTotal(updatedCart.getTotal());
                return cart;
            }
        }
        return null;
    }

    public void delete(Long id) {
        carts.removeIf(cart -> cart.getId().equals(id));
    }
}
