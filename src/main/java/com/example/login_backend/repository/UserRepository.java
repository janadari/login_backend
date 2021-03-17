package com.example.login_backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.login_backend.model.UserDao;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}