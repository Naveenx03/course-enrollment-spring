package com.naveen.enrollment.dto.course;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class CourseRequest {

    @NotBlank
    private String title;

    @Min(1L)
    private long capacity;

    public String getTitle() {
        return title;
    }

    public long getCapacity() {
        return capacity;
    }

}
