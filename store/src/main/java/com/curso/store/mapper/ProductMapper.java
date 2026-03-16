package com.curso.store.mapper;

import com.curso.store.domains.Product;
import com.curso.store.dto.ProductDTO;

public class ProductMapper {

    public static Product toEntity(ProductDTO dto) {

        Product product = new Product();

        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setCategory(dto.getCategory());

        return product;
    }

}