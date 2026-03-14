package com.curso.store.repositorio;

import com.curso.store.domains.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> list() {
        return products;
    }

    public Product save(Product product) {
        product.setId(nextId);
        nextId++;
        products.add(product);
        return product;
    }

    public Product update(Long id, Product updatedProduct) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                product.setCategory(updatedProduct.getCategory());
                return product;
            }
        }
        return null;
    }

    public void delete(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}