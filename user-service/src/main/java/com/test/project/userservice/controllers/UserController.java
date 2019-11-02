package com.test.project.userservice.controllers;

import com.test.project.userservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.project.userservice.repositories.UserRepository;

@RestController()
@RequestMapping("/user-service")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return repository.findById((long) id).get();
    }

    @PostMapping("/")
    public void setUser() {
        User test = new User("firstname", "lastname");
        repository.save(test);
    }
}
