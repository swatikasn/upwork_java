package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(String message) {
        super(message);  // this passes the error message to the RuntimeException class
    }
}
