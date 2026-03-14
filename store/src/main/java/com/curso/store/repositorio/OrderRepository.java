package com.curso.store.repositorio;

import com.curso.store.domains.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private final List<Order> orders = new ArrayList<>();
    private Long nextId = 1L;

    public List<Order> list() {
        return orders;
    }

    public Order save(Order order) {
        order.setId(nextId);
        nextId++;
        orders.add(order);
        return order;
    }

    public Order update(Long id, Order updatedOrder) {

        for (Order order : orders) {

            if (order.getId().equals(id)) {

                order.setUserId(updatedOrder.getUserId());
                order.setCartId(updatedOrder.getCartId());
                order.setPaymentId(updatedOrder.getPaymentId());
                order.setTotal(updatedOrder.getTotal());

                return order;
            }
        }

        return null;
    }

    public void delete(Long id) {
        orders.removeIf(order -> order.getId().equals(id));
    }
}
