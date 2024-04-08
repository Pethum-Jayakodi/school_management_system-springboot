package com.example.EAD2Project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Staff {

    @Id
    private String S_nic;
    private String S_firstName;
    private String S_lastName;
    private String S_address;
    private String telephone;
    private String position;
    private double salary;

}
