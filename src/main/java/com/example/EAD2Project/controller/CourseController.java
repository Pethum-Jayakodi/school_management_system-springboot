package com.example.EAD2Project.controller;

import com.example.EAD2Project.entity.Course;
import com.example.EAD2Project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/saveCourse")
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @GetMapping("/viewCourse/{c_code}")
    public Course viewCourse(@PathVariable String c_code){
        return courseService.getCourse(c_code);
    }

    @DeleteMapping("/deleteCourse/{c_code}")
    public String deleteCourse(@PathVariable String c_code){
        return courseService.deleteCourse(c_code);
    }
}
