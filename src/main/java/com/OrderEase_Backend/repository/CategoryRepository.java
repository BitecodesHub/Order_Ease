package com.OrderEase_Backend.repository;

import com.OrderEase_Backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
