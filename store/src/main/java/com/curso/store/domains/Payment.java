package com.curso.store.domains;

import com.curso.store.enums.PaymentStatus;

public class Payment {

    private Long id;
    private Long cartId;
    private Double amount;
    private PaymentStatus status;

    public Payment() {
    }

    public Payment(Long id, Long cartId, Double amount, PaymentStatus status) {
        this.id = id;
        this.cartId = cartId;
        this.amount = amount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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