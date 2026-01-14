package com.naveen.enrollment.dto.enrollment;

import jakarta.validation.constraints.Min;

public class EnrollmentRequest {

    @Min(1L)
    private long studentId;

    @Min(1L)
    private long courseId;

    public long getStudentId() {
        return studentId;
    }

    public long getCourseId() {
        return courseId;
    }

}
