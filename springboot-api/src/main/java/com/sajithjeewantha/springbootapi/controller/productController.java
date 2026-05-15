package com.sajithjeewantha.springbootapi.controller;

import com.sajithjeewantha.springbootapi.model.Product;
import com.sajithjeewantha.springbootapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class productController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return new ResponseEntity<>(service.save(product), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        Optional<Product> product = service.getById(id);
        if (product.isPresent()) {
            return new ResponseEntity<>(product.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product product) {
        return new ResponseEntity<>(service.update(id, product), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
    }
}
