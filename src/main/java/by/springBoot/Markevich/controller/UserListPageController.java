package by.springBoot.Markevich.controller;

import by.springBoot.Markevich.model.User;
import by.springBoot.Markevich.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/list")
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
