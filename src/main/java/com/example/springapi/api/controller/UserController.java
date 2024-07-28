package com.example.springapi.api.controller;

import com.example.springapi.service.UserService;
import com.example.springapi.api.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    // Injection
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getuser(@RequestParam Integer id){
        Optional<User> user = userService.getUser(id);
        return (User) user.orElse(null);
    }
}
