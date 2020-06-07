package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

//    @GetMapping("/list")
//    public String userList(){
//        return "userList";
//    }

//    @PostMapping("/uploadForm")
//    public String upload(){
//        return "uploadForm";
//    }

}
