package com.curso.store.dto;

import com.curso.store.enums.ProductCategory;

public class ProductDTO {

    private String name;
    private Double price;
    private ProductCategory category;

    public ProductDTO() {
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}