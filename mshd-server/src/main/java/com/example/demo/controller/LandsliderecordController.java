package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.LandsliderecordEntity;
import com.example.demo.service.LandsliderecordService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class LandsliderecordController {
    @Autowired
    LandsliderecordService landsliderecordService;
    @CrossOrigin
    @PostMapping("api/landsliderecord")
    @ResponseBody
    public List<LandsliderecordEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (landsliderecordService.getById(did));
    }
}
