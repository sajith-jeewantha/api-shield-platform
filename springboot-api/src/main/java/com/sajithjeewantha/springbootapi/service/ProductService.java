package com.sajithjeewantha.springbootapi.service;

import com.sajithjeewantha.springbootapi.model.Product;
import com.sajithjeewantha.springbootapi.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAll() {
        return productRepo.findAll();
    }

    public Optional<Product> getById(Long id) {
        return productRepo.findById(id);
    }

    public Product update(Long id, Product newProduct) {
        return productRepo.findById(id).map(p -> {
            p.setName(newProduct.getName());
            p.setDescription(newProduct.getDescription());
            p.setPrice(newProduct.getPrice());
            p.setQuantity(newProduct.getQuantity());
            return productRepo.save(p);
        }).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void delete(Long id) {
        productRepo.deleteById(id);
    }

}
