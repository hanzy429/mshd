package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.SettlementrecordEntity;
import com.example.demo.service.SettlementrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class SettlementrecordController {
    @Autowired
    SettlementrecordService settlementrecordService;
    @CrossOrigin
    @PostMapping("api/settlementrecord")
    @ResponseBody
    public List<SettlementrecordEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (settlementrecordService.getById(did));
    }
}
