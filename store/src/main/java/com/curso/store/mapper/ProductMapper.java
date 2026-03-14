package com.curso.store.mapper;

import com.curso.store.dto.ProductDTO;
import com.curso.store.model.Product;

public class ProductMapper {

    public static Product toEntity(ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setCategory(dto.getCategory());
        return product;
    }
}