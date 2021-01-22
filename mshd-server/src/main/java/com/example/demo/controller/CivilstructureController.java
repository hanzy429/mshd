package com.example.demo.controller;

import com.example.demo.pojo.CivilstructureEntity;
import com.example.demo.pojo.DeathstatisticsEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.service.CivilstructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class CivilstructureController {
    @Autowired
    CivilstructureService civilstructureService;
    @CrossOrigin
    @PostMapping("api/civilstructure")
    @ResponseBody
    public List<CivilstructureEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (civilstructureService .getById(did));
    }
}
