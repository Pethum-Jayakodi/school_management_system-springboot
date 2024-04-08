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

public class LectureHall {

    @Id
    private String batchCode;
    private int hallNo;
    private Date occupiedDate;
    private String lecturerName;
}
