package com.curso.store.service;

import com.curso.store.model.Product;
import com.curso.store.repositorio.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    private final ProductRepository repository;

    public StoreService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> listProducts() {
        return repository.list();
    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        return repository.update(id, product);
    }

    public void deleteProduct(Long id) {
        repository.delete(id);
    }
}