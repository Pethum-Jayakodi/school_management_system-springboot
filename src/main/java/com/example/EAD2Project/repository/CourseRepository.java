package com.example.EAD2Project.repository;

import com.example.EAD2Project.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,String> {
}
