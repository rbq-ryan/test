package com.example.bookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
