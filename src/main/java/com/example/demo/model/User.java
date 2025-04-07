package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String role; // "freelancer", "client", "admin"
    private List<String> skills;
    private String phone;
    private boolean isEmailVerified;
    private boolean isPhoneVerified;
    private String profilePicture;
    private String companyName;
    private String companyLogoUrl;
    private List<String> portfolioLinks;
    private double hourlyRate;
    private double profileCompletion;
}
