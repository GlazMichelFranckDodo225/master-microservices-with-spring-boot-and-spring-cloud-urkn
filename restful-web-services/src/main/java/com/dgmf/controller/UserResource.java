package com.dgmf.controller;

import com.dgmf.entity.User;
import com.dgmf.service.UserDaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// This Class is responsible for handling HTTP requests related to users.
@RestController
public class UserResource {
    // Initialize the UserDaoService dependency.
    private UserDaoService userDaoService;

    // Constructor Injection for the UserDaoService dependency.
    public UserResource(UserDaoService userDaoService) {
        // Inject the UserDaoService dependency.
        this.userDaoService = userDaoService;
    }

    // Retrieve all users.
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        // Find and return all users.
        return userDaoService.findAll();
    }

    // Retrieve a user by ID.
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable Long id) {
        // Find and return the first user that matches the ID.
        return userDaoService.findOne(id);
    }
}
