package com.naveen.enrollment.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String msg){
        super(msg);
    }
}
