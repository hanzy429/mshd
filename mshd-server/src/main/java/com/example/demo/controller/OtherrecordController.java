package com.example.demo.controller;


import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.OildisasterEntity;
import com.example.demo.pojo.OtherrecordEntity;
import com.example.demo.service.OtherrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class OtherrecordController {
    @Autowired
    OtherrecordService otherrecordService;
    @CrossOrigin
    @PostMapping("api/otherrecord")
    @ResponseBody
    public List<OtherrecordEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (otherrecordService.getById(did));
    }
}
