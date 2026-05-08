package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/users")

public class UserController<UserModel> {
    @Autowired //cria os contrutores automatico
    UserService userService;

    @GetMapping("/allUsers")
    public List<UserModel> getAllUsers(){
        return userService.getAllUsers();

    }

    @PostMapping("/add")
    public UserModel newUser(@RequestBody UserModel user){

        return userService.addNewUser(user);
    }
    



    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    
}
