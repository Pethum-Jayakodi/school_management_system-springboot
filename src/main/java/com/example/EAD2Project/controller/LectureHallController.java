package com.example.EAD2Project.controller;

import com.example.EAD2Project.entity.LectureHall;
import com.example.EAD2Project.service.LectureHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/LectureHall")

public class LectureHallController {

    @Autowired
    private LectureHallService lectureHallService;


    @DeleteMapping("/daleteLectureHall/{batchCode}")
    public String daleteLectureHall(@PathVariable String batchCode){
        return lectureHallService.deleteLectureHall(batchCode);
    }
}
