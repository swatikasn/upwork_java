package com.example.demo.controller;

import com.example.demo.exception.InvalidInputException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            throw new InvalidInputException("User name cannot be empty");
        }
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));

        if (updatedUser.getName() == null || updatedUser.getName().trim().isEmpty()) {
            throw new InvalidInputException("Updated user name cannot be empty");
        }

        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        userRepository.delete(user);
        return "User deleted successfully";
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
