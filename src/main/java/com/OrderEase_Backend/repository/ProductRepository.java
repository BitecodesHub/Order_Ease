package com.OrderEase_Backend.repository;

import com.OrderEase_Backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
