package com.curso.store.domains;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long cartId;
    private Long paymentId;
    private Double total;

    public Order() {
    }

    public Order(Long id, Long userId, Long cartId, Long paymentId, Double total) {
        this.id = id;
        this.userId = userId;
        this.cartId = cartId;
        this.paymentId = paymentId;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getCartId() {
        return cartId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public Double getTotal() {
        return total;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}