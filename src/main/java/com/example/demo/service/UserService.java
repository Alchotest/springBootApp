package com.example.demo.service;

import com.example.demo.DataTransferObject.UserDto;
import com.example.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserDto registration);

    List<User> findAllUsers();
}
