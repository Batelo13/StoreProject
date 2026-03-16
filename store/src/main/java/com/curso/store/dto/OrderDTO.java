package com.curso.store.dto;

public class OrderDTO {

    private Long userId;
    private Long cartId;
    private Long paymentId;
    private Double total;

    public OrderDTO() {
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