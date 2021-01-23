package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.KarstrecordEntity;
import com.example.demo.service.KarstrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class KarstrecordController {
    @Autowired
    KarstrecordService karstrecordService;
    @CrossOrigin
    @PostMapping("api/karstrecord")
    @ResponseBody
    public List<KarstrecordEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (karstrecordService.getById(did));
    }
}
