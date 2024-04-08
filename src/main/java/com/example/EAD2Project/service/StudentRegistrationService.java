package com.example.EAD2Project.service;

import com.example.EAD2Project.entity.StudentRegistration;
import com.example.EAD2Project.repository.StudentRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentRegistrationService {

    @Autowired
    private StudentRegistrationRepository studentRegistrationRepository;

    public StudentRegistration save(StudentRegistration studentRegistration){
        return studentRegistrationRepository.save(studentRegistration);
    }

    public StudentRegistration getStudents(String NIC){
        return studentRegistrationRepository.findById(NIC).orElse(null);
    }
    public String deleteStudents(String NIC){
        studentRegistrationRepository.deleteById(NIC);
        return "Deleted";
    }

}
