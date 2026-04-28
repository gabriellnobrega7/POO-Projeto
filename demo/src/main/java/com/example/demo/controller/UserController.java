package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/users")

public class UserController {
    
    UserService userservice;

    @GetMapping("/allUsers")
    public List<UserModel> getAllUsers(){
        return userservice.getAll();

    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    
}
