package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.InjuredstatisticsEntity;
import com.example.demo.pojo.MissingstatisticsEntity;
import com.example.demo.service.MissingstatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class MissingstatisticsController {
    @Autowired
    MissingstatisticsService missingstatisticsService;
    @CrossOrigin
    @PostMapping("api/missingStatistics")
    @ResponseBody
    public List<MissingstatisticsEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (missingstatisticsService.getById(did));
    }
}
