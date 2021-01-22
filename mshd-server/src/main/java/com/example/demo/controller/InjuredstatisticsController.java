package com.example.demo.controller;

import com.example.demo.pojo.DeathstatisticsEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.InjuredstatisticsEntity;
import com.example.demo.service.DeathStatisticsService;
import com.example.demo.service.InjuredstatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class InjuredstatisticsController {
    @Autowired
    InjuredstatisticsService injuredstatisticsService;
    @CrossOrigin
    @PostMapping("api/injuredStatistics")
    @ResponseBody
    public List<InjuredstatisticsEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (injuredstatisticsService.getById(did));
    }
}
