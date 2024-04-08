package com.example.EAD2Project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class StudentRegistration {

    @Id
    private String NIC;
    private String Firstname;
    private String last_name;
    private String email_address;
    private Date DOB;
    private String phoneNumber;
}
