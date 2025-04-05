package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SampleEntity;
import com.example.demo.service.SampleService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/users")
public class SampleController {
	
	@Autowired
	SampleService service;

    @PostMapping
    public SampleEntity addUser(@RequestBody SampleEntity user) {
        return service.save(user);
    }

    @GetMapping("/all")
    public List<SampleEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public SampleEntity getUser(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.delete(id);
    }

}
