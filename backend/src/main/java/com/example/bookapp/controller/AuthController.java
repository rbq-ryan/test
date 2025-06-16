package com.example.bookapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookapp.entity.User;
import com.example.bookapp.repository.UserRepository;

@RestController
public class AuthController {
    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        // dummy login for example only
        return userRepository.findByUsername(user.getUsername());
    }
}
