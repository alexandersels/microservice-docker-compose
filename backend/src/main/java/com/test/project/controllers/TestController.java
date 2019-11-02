package com.test.project.controllers;


import com.test.project.entities.Name;
import com.test.project.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestRepository repository;

    @GetMapping("/{id}")
    public Name getTest(@PathVariable int id) {
        return repository.findById((long) id).get();
    }

    @PostMapping("/")
    public void setTest() {
        Name test = new Name();
        test.setName("Alexander");
        repository.save(test);
    }
}
