package com.curso.store.domains;

public class Order {

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}