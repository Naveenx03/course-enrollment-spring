package com.naveen.enrollment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.enrollment.dto.enrollment.EnrollmentRequest;
import com.naveen.enrollment.service.EnrollStudentIntoCourse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("enrollments")
public class EnrollmentController {

    private EnrollStudentIntoCourse enrollService;

    public EnrollmentController() {
    }

    public EnrollmentController(EnrollStudentIntoCourse enrollService) {
        this.enrollService = enrollService;
    }

    @PostMapping
    ResponseEntity<Void> enroll(@Valid @RequestBody EnrollmentRequest request){
        enrollService.enroll(request.getStudentId(), request.getCourseId());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
}
