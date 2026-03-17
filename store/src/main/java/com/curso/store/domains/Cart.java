package com.curso.store.domains;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    @ElementCollection
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

    public Long getUserId() {
        return userId;
    }

    public List<Long> getProductIds() {
        return productIds;
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

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}