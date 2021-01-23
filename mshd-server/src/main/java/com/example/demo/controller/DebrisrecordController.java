package com.example.demo.controller;

import com.example.demo.pojo.DebrisrecordEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.service.DebrisrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class DebrisrecordController {
    @Autowired
    DebrisrecordService debrisrecordService;
    @CrossOrigin
    @PostMapping("api/debrisrecord")
    @ResponseBody
    public List<DebrisrecordEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (debrisrecordService.getById(did));
    }
}
