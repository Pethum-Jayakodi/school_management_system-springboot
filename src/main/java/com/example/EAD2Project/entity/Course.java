package com.example.EAD2Project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Course {

    private String c_name;
    @Id
    private String c_code;
    private int min_students;
    private int max_students;
    private Date start;
    private Date end;
    private boolean is_cancelled;

}
