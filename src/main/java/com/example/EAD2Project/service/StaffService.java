package com.example.EAD2Project.service;

import com.example.EAD2Project.entity.Staff;
import com.example.EAD2Project.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public Staff saveStaff(Staff staff){
        return staffRepository.save(staff);
    }

    public Staff getStaff(String S_nic){
        return staffRepository.findById(S_nic).orElse(null);
    }

    public String deleteStaff(String S_nic){
        staffRepository.findById(S_nic);
        return "Deleted";
    }
}
