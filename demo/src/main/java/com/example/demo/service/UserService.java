package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    
    public List<UserModel> getAllUsers(){

        @Autowired
        UserRepository userRepository;

        public List<UserModel> getAllUsers(){

            return userRepository.findAll();

        }

        public UserModel addNewUser(UserModel user){

            return userRepository.save(user);
        }
    }


}
