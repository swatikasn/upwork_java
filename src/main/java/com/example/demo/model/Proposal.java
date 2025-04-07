package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "proposals")
public class Proposal {
    @Id
    private String id;
    private String jobId; // Reference to Job
    private String freelancerId; // Reference to User
    private String coverLetter;
    private double bidAmount;
    private String status; // "pending", "accepted", "rejected"
    private List<String> attachments;
    private String freelancerProfileId;
}
