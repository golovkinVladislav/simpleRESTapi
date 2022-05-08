package com.vladislav.golovkin.exceptionHandling;

public class EmployeeException extends RuntimeException{
    public EmployeeException(String message) {
        super(message);
    }
}
