package com.OrderEase_Backend.repository;

import com.OrderEase_Backend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
