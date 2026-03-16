package com.curso.store.dto;

import com.curso.store.enums.PaymentStatus;

public class PaymentDTO {

    private Long cartId;
    private Double amount;
    private PaymentStatus status;

    public PaymentDTO() {
    }

    public Long getCartId() {
        return cartId;
    }

    public Double getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}