package com.curso.store.controller;

import com.curso.store.domains.Order;
import com.curso.store.dto.OrderDTO;
import com.curso.store.mapper.OrderMapper;
import com.curso.store.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<Order> list() {
        return service.listOrders();
    }

    @PostMapping
    public Order create(@RequestBody OrderDTO dto) {
        Order order = OrderMapper.toEntity(dto);
        return service.createOrder(order);
    }

    @PutMapping("/{id}")
    public Order update(@PathVariable Long id, @RequestBody OrderDTO dto) {
        Order order = OrderMapper.toEntity(dto);
        return service.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteOrder(id);
    }
}