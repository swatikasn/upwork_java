package com.example.demo.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "applications")
public class Application {
    @Id
    private String id;
    private String jobId; // Reference to Job
    private String freelancerId; // Reference to User
    private String proposalId; // Reference to Proposal
    private String status;
    private LocalDateTime submissionDate;
}
