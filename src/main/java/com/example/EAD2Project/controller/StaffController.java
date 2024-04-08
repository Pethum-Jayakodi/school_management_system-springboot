package com.example.EAD2Project.controller;

import com.example.EAD2Project.entity.Staff;
import com.example.EAD2Project.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping("/saveStaff")
    public Staff saveStaff(@RequestBody Staff staff){
        return staffService.saveStaff(staff);
    }

    @GetMapping("/viewStaff/{S_nic}")
    public Staff viewStaff(@PathVariable String S_nic){
        return staffService.getStaff(S_nic);
    }

    @DeleteMapping("/deleteStaff/{S_nic}")
    public String deleteStaff(@PathVariable String S_nic){
        return staffService.deleteStaff(S_nic);
    }
}
