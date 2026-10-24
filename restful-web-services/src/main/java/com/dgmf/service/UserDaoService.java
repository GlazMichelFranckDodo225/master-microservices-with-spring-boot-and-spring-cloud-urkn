package com.dgmf.service;

import com.dgmf.entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// This is a User DAO Service that provides CRUD operations for
// User entity.
@Component
public class UserDaoService {
    // Create a list of users
    private static List<User> users = new ArrayList<>();

    // Populate the list of users
    static {
        users.add(new User(1L, "John", LocalDate.of(1990, 1, 1)));
        users.add(new User(2L, "Jane", LocalDate.of(1995, 6, 15)));
        users.add(new User(3L, "Bob", LocalDate.of(1985, 11, 20)));
    }

    // Find all users
    public List<User> findAll() {
        return users;
    }
}
