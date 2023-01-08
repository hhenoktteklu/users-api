package com.springboot.project01.service;

import com.springboot.project01.model.User;
import com.springboot.project01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
    return userRepository.getAllUsers();
    }

    public User getUser(long id) {
        return userRepository.getUser(id);
    }

    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    public void removeUser(long id) {
         userRepository.removeUser(id);
    }
}
