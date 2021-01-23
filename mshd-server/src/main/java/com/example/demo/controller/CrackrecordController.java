package com.example.demo.controller;

import com.example.demo.pojo.CrackrecordEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.service.CrackrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class CrackrecordController {
    @Autowired
    CrackrecordService crackrecordService;
    @CrossOrigin
    @PostMapping("api/crackrecord")
    @ResponseBody
    public List<CrackrecordEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (crackrecordService.getById(did));
    }
}
