package com.curso.store.dto;

import java.util.List;

public class CartDTO {

    private Long userId;
    private List<Long> productIds;
    private Double total;

    public CartDTO() {
    }

    public CartDTO(Long userId, List<Long> productIds, Double total) {
        this.userId = userId;
        this.productIds = productIds;
        this.total = total;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
