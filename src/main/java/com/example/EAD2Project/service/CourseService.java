package com.example.EAD2Project.service;

import com.example.EAD2Project.entity.Course;
import com.example.EAD2Project.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    public Course getCourse(String c_code){
        return courseRepository.findById(c_code).orElse(null);
    }

    public String deleteCourse(String c_code){
        courseRepository.deleteById(c_code);
        return "deleted";
    }
}
