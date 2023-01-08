package com.springboot.project01.controller;

import com.springboot.project01.model.User;
import com.springboot.project01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get-users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get-user/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

    @PostMapping("/add-user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/remove-user/{id}")
    public void removeUser(@PathVariable long id) {
         userService.removeUser(id);
    }
}
