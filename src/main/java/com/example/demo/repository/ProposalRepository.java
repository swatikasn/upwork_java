package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.Proposal;
import java.util.List;

public interface ProposalRepository extends MongoRepository<Proposal, String> {
    List<Proposal> findByJobId(String jobId);
}