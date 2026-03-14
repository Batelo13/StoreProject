package com.curso.store.dto;

import com.curso.store.enums.PaymentStatus;

public class PaymentDTO {

    private Long cartId;
    private Double amount;
    private PaymentStatus status;

    public PaymentDTO() {
    }

    public PaymentDTO(Long cartId, Double amount, PaymentStatus status) {
        this.cartId = cartId;
        this.amount = amount;
        this.status = status;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
