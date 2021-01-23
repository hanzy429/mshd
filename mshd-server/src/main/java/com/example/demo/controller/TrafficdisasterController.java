package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.OtherstructureEntity;
import com.example.demo.pojo.TrafficdisasterEntity;
import com.example.demo.service.TrafficdisasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class TrafficdisasterController {
    @Autowired
    TrafficdisasterService trafficdisasterService;
    @CrossOrigin
    @PostMapping("api/trafficdisaster")
    @ResponseBody
    public List<TrafficdisasterEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (trafficdisasterService.getById(did));
    }
}
