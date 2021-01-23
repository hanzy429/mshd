package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.TrafficdisasterEntity;
import com.example.demo.pojo.WaterdisasterEntity;
import com.example.demo.service.WaterdisasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class WaterdisasterController {
    @Autowired
    WaterdisasterService waterdisasterService;
    @CrossOrigin
    @PostMapping("api/waterdisaster")
    @ResponseBody
    public List<WaterdisasterEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (waterdisasterService.getById(did));
    }
}
