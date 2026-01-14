package com.naveen.enrollment.exception;

public class DuplicateEnrollmentException extends RuntimeException{
    public DuplicateEnrollmentException(String msg){
        super(msg);
    }
}
