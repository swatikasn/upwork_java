package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "organizations")
public class Organization {
    @Id
    private String id;
    private String clientId; // Reference to User
    private String companyName;
    private String companyLogoUrl;
    private String industry;
    private int teamSize;
    private String website;
}
