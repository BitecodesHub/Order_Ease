package com.OrderEase_Backend.repository;

import com.OrderEase_Backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
