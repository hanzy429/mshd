package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.MissingstatisticsEntity;
import com.example.demo.pojo.OtherstructureEntity;
import com.example.demo.service.MissingstatisticsService;
import com.example.demo.service.OtherstructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class OtherstructureController {
    @Autowired
    OtherstructureService otherstructureService;
    @CrossOrigin
    @PostMapping("api/otherstructure")
    @ResponseBody
    public List<OtherstructureEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (otherstructureService.getById(did));
    }
}
