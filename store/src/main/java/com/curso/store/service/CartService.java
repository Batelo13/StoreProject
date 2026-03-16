package com.curso.store.service;

import com.curso.store.domains.Cart;
import com.curso.store.repositorio.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository repository;

    public CartService(CartRepository repository) {
        this.repository = repository;
    }

    public List<Cart> listCarts() {
        return repository.findAll();
    }

    public Cart createCart(Cart cart) {
        return repository.save(cart);
    }

    public Cart updateCart(Long id, Cart cart) {

        Cart existingCart = repository.findById(id).orElse(null);

        if (existingCart == null) {
            return null;
        }

        existingCart.setUserId(cart.getUserId());
        existingCart.setProductIds(cart.getProductIds());
        existingCart.setTotal(cart.getTotal());

        return repository.save(existingCart);
    }

    public void deleteCart(Long id) {
        repository.deleteById(id);
    }
}