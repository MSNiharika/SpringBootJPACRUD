package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.SampleEntity;
import com.example.demo.repository.SampleRepo;

@Service
public class SampleService {
	
	private final SampleRepo repo;

    public SampleService(SampleRepo repo) {
        this.repo = repo;
    }

    public SampleEntity save(SampleEntity user) {
        return repo.save(user);
    }

    public List<SampleEntity> getAll() {
        return repo.findAll();
    }

    public SampleEntity getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
