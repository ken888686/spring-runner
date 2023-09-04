package com.aaron.springrunner.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aaron.springrunner.models.User;
import com.aaron.springrunner.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> get() {
        return userService.getAll();
    }

    @GetMapping("{id}")
    public User get(@PathVariable String id) {
        return userService.get(Long.valueOf(id));
    }

    @PutMapping
    public User add(@RequestBody User data) {
        return userService.add(data);
    }
}
