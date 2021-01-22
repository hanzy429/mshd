package com.example.demo.controller;


import com.example.demo.pojo.FrameworkstructureEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.MasonrystructureEntity;
import com.example.demo.service.FrameworkstructureService;
import com.example.demo.service.MasonrystructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class FrameworkstructureController {
    @Autowired
    FrameworkstructureService frameworkstructureService;
    @CrossOrigin
    @PostMapping("api/frameworkstructure")
    @ResponseBody
    public List<FrameworkstructureEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (frameworkstructureService.getById(did));
    }
}
