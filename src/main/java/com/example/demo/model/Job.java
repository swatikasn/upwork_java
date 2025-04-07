package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "jobs")
public class Job {
    @Id
    private String id;
    private String title;
    private String description;
    private String clientId; // Reference to User
    private List<String> requiredSkills;
    private double budget;
    private String status;

    private List<String> attachments;
    private boolean isPreviewEnabled;
}
