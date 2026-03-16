package com.curso.store.dto;

import java.util.List;

public class CartDTO {

    private Long userId;
    private List<Long> productIds;
    private Double total;

    public CartDTO() {
    }

    public Long getUserId() {
        return userId;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public Double getTotal() {
        return total;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}