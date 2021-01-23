package com.example.demo.controller;

import com.example.demo.pojo.CommdisasterEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.service.CommdisasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class CommdisasterController {
    @Autowired
    CommdisasterService commdisasterService;
    @CrossOrigin
    @PostMapping("api/commdisaster")
    @ResponseBody
    public List<CommdisasterEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (commdisasterService.getById(did));
    }
}
