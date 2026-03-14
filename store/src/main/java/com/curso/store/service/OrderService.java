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
        return repository.list();
    }

    public Order createOrder(Order order) {
        return repository.save(order);
    }

    public Order updateOrder(Long id, Order order) {
        return repository.update(id, order);
    }

    public void deleteOrder(Long id) {
        repository.delete(id);
    }
}
