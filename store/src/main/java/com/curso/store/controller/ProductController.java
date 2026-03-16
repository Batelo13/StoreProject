package com.curso.store.controller;

import com.curso.store.dto.ProductDTO;
import com.curso.store.mapper.ProductMapper;
import com.curso.store.domains.Product;
import com.curso.store.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> list() {
        return service.listProducts();
    }

    @PostMapping
    public Product create(@RequestBody ProductDTO dto) {

        Product product = ProductMapper.toEntity(dto);

        return service.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody ProductDTO dto) {

        Product product = ProductMapper.toEntity(dto);

        return service.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        service.deleteProduct(id);

    }
}