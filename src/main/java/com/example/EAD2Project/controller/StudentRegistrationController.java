package com.example.EAD2Project.controller;

import com.example.EAD2Project.entity.StudentRegistration;
import com.example.EAD2Project.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/StudentRegistration")

public class StudentRegistrationController {

    @Autowired
    private StudentRegistrationService studentRegistrationService;

    @PostMapping("/saveStudents")
    public StudentRegistration saveStudent(@RequestBody StudentRegistration studentRegistration){
        System.out.println(studentRegistration);
        return studentRegistrationService.save(studentRegistration);
    }

    @GetMapping("/viewStudents/{NIC}")
    public StudentRegistration viewStudents(@PathVariable String NIC){
        return studentRegistrationService.getStudents(NIC);
    }

    @DeleteMapping("/deleteStudents/{NIC}")
    public String deleteStudents(@PathVariable String NIC){
        return studentRegistrationService.deleteStudents(NIC);
    }


}
