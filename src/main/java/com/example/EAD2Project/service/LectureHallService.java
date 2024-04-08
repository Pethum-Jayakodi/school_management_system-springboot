package com.example.EAD2Project.service;

import com.example.EAD2Project.entity.LectureHall;
import com.example.EAD2Project.repository.LectureHallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LectureHallService {

    @Autowired
    private LectureHallRepository lectureHallRepository;

    private LectureHall saveLectureHall(LectureHall lectureHall){
        return lectureHallRepository.save(lectureHall);
    }

    private LectureHall getLectureHall(String batchCode){
        return lectureHallRepository.findById(batchCode).orElse(null);
    }

    public String deleteLectureHall(String batchCode){
        lectureHallRepository.deleteById(batchCode);
        return "Deleted";
    }
}
