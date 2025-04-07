package com.example.demo.exception;

public class InvalidInputException extends RuntimeException {
    
    public InvalidInputException(String message) {
        super(message);  // pass error message to base class
    }
}
