package com.example.credit_application.SpringBootProduct;

import com.example.credit_application.SpringBootProduct.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
