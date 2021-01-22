package com.example.demo.controller;

import com.example.demo.pojo.BrickwoodstructureEntity;
import com.example.demo.pojo.CivilstructureEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.service.BrickwoodstructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class BrickwoodstructureController {
    @Autowired
    BrickwoodstructureService brickwoodstructureService;
    @CrossOrigin
    @PostMapping("api/brickwoodstructure")
    @ResponseBody
    public List<BrickwoodstructureEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (brickwoodstructureService.getById(did));
    }
}
