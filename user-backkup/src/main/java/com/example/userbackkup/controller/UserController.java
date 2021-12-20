package com.example.userbackkup.controller;

import com.example.userbackkup.domain.User;
import com.example.userbackkup.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public List<User> users() {
        System.err.println("user2");
        return userMapper.findAll();

    }
}
