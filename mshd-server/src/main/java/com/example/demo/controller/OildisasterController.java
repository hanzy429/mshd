package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.OildisasterEntity;
import com.example.demo.pojo.TrafficdisasterEntity;
import com.example.demo.service.OildisasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class OildisasterController {
    @Autowired
    OildisasterService oildisasterService;
    @CrossOrigin
    @PostMapping("api/oildisaster")
    @ResponseBody
    public List<OildisasterEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (oildisasterService.getById(did));
    }
}
