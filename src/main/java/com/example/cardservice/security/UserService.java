package com.example.cardservice.security;


public interface UserService {
    User save(UserDto user);
    User findByUsername(String username);
}