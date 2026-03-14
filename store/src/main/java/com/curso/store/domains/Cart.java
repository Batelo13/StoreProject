package com.curso.store.domains;

import java.util.List;

public class Cart {

    private Long id;
    private Long userId;
    private List<Long> productIds;
    private Double total;

    public Cart() {
    }

    public Cart(Long id, Long userId, List<Long> productIds, Double total) {
        this.id = id;
        this.userId = userId;
        this.productIds = productIds;
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
