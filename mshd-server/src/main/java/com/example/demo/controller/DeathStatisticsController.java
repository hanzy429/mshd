package com.example.demo.controller;

import com.example.demo.pojo.DeathstatisticsEntity;
import  com.example.demo.pojo.IDPageRequest;
import  com.example.demo.service.DeathStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class DeathStatisticsController {

    @Autowired
    DeathStatisticsService deathStatisticsService;
    @CrossOrigin
    @PostMapping("api/deathStatistics")
    @ResponseBody
    public List<DeathstatisticsEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (deathStatisticsService.getById(did));
    }
}
