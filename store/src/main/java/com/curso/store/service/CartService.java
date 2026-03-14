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
        return repository.list();
    }

    public Cart createCart(Cart cart) {
        return repository.save(cart);
    }

    public Cart updateCart(Long id, Cart cart) {
        return repository.update(id, cart);
    }

    public void deleteCart(Long id) {
        repository.delete(id);
    }
}
