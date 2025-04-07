package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.Job;
import java.util.List;

public interface JobRepository extends MongoRepository<Job, String> {
    List<Job> findByClientId(String clientId);
}