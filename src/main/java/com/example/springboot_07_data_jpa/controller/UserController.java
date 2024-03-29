package com.example.springboot_07_data_jpa.controller;

import com.example.springboot_07_data_jpa.entity.User;
import com.example.springboot_07_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public Optional< User> getUser(@PathVariable("id") Integer id){

        Optional< User> user=userRepository.findById(id);
        return user;

    }
//    http://localhost:8080/user?lastName=jane&&email=ddsafdf
    @GetMapping("/user")
    public User insertUser(User user){
        User save=userRepository.save(user);
        return save;

    }

}

