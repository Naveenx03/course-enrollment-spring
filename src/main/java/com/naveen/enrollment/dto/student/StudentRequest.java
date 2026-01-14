package com.naveen.enrollment.dto.student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class StudentRequest {

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
}
