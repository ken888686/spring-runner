package com.aaron.springrunner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaron.springrunner.models.User;
import com.aaron.springrunner.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User get(long id) {
        return userRepository.getReferenceById(id);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User add(User data) {
        var user = userRepository.save(data);
        return user;
    }
}
