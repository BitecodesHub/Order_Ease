package com.OrderEase_Backend.repository;

import com.OrderEase_Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
