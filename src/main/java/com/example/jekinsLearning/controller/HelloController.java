package com.example.jekinsLearning.controller;

import com.example.jekinsLearning.model.User;
import com.example.jekinsLearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public User index() {
        return userService.findUserById(1);
    }
}
