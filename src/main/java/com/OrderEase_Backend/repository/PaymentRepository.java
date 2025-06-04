package com.OrderEase_Backend.repository;

import com.OrderEase_Backend.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
