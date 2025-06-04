package com.OrderEase_Backend.repository;

import com.OrderEase_Backend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
