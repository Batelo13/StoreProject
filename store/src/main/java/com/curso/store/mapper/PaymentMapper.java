package com.curso.store.mapper;

import com.curso.store.domains.Payment;
import com.curso.store.dto.PaymentDTO;

public class PaymentMapper {

    public static Payment toEntity(PaymentDTO dto) {

        Payment payment = new Payment();

        payment.setCartId(dto.getCartId());
        payment.setAmount(dto.getAmount());
        payment.setStatus(dto.getStatus());

        return payment;
    }
}