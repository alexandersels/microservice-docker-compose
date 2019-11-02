package com.test.project.product.controllers;

import com.test.project.product.domain.Product;
import com.test.project.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return repository.findById((long) id).get();
    }

    @PostMapping("/")
    public void setProduct() {
        Product test = new Product("product", 200.0);
        repository.save(test);
    }
}
