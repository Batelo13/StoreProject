package com.curso.store.controller;

import com.curso.store.domains.Cart;
import com.curso.store.dto.CartDTO;
import com.curso.store.mapper.CartMapper;
import com.curso.store.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cart> list() {
        return service.listCarts();
    }

    @PostMapping
    public Cart create(@RequestBody CartDTO dto) {

        Cart cart = CartMapper.toEntity(dto);

        return service.createCart(cart);
    }

    @PutMapping("/{id}")
    public Cart update(@PathVariable Long id, @RequestBody CartDTO dto) {

        Cart cart = CartMapper.toEntity(dto);

        return service.updateCart(id, cart);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        service.deleteCart(id);
    }
}