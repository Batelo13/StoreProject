package com.curso.store.mapper;

import com.curso.store.domains.Order;
import com.curso.store.dto.OrderDTO;

public class OrderMapper {

    public static Order toEntity(OrderDTO dto) {

        Order order = new Order();

        order.setUserId(dto.getUserId());
        order.setCartId(dto.getCartId());
        order.setPaymentId(dto.getPaymentId());
        order.setTotal(dto.getTotal());

        return order;
    }
}