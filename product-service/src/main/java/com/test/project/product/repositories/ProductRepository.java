package com.test.project.product.repositories;

import com.test.project.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface ProductRepository extends JpaRepository<Product, Long> {
}
