package com.curso.store.service;

import com.curso.store.domains.Order;
import com.curso.store.repositorio.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> listOrders() {
        return repository.findAll();
    }

    public Order createOrder(Order order) {
        return repository.save(order);
    }

    public Order updateOrder(Long id, Order order) {
        Order existingOrder = repository.findById(id).orElse(null);

        if (existingOrder == null) {
            return null;
        }

        existingOrder.setUserId(order.getUserId());
        existingOrder.setCartId(order.getCartId());
        existingOrder.setPaymentId(order.getPaymentId());
        existingOrder.setTotal(order.getTotal());

        return repository.save(existingOrder);
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}