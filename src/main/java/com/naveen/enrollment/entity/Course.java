package com.naveen.enrollment.entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(scale=1)
    private long capacity;

    @OneToMany(mappedBy = "course", orphanRemoval = true)
    List<Enrollment> enrollments = new ArrayList<>();

    @Version
    private long version;

    protected Course(){}

    public Course(String title, long capacity){
        this.title = title;
        this.capacity = capacity;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public long getCapacity() {
        return capacity;
    }
    
}
