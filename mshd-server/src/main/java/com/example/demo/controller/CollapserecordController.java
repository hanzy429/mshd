package com.example.demo.controller;

import com.example.demo.pojo.CollapserecordEntity;
import com.example.demo.pojo.DeathstatisticsEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.service.CollapserecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class CollapserecordController {
    @Autowired
    CollapserecordService collapserecordService;
    @CrossOrigin
    @PostMapping("api/collapserecord")
    @ResponseBody
    public List<CollapserecordEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (collapserecordService.getById(did));
    }
}
