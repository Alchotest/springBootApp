package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserListPageController {

    private final UserService userService;

    public UserListPageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getAllUsers(Model model){
        List<User> allUsers = userService.findAllUsers();
        model.addAttribute("userList", allUsers);
        return "userList";
    }
}
