package com.naveen.enrollment.exception;

public class CourseCapacityFullException extends RuntimeException{
    public CourseCapacityFullException(String msg){
        super(msg);
    }
}
