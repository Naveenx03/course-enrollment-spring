package com.naveen.enrollment.exception;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String msg){
        super(msg);
    }
}
