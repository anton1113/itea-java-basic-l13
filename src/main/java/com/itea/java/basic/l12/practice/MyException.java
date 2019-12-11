package com.itea.java.basic.l12.practice;

public class MyException extends RuntimeException {

    private String description;

    public MyException(String message) {
        super(message);
        description = "This is a description";
    }

    public String getDescription() {
        return description;
    }
}
