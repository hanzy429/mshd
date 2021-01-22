package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.MasonrystructureEntity;
import com.example.demo.pojo.MissingstatisticsEntity;
import com.example.demo.service.MasonrystructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class MasonrystructureController {
    @Autowired
    MasonrystructureService masonrystructureService;
    @CrossOrigin
    @PostMapping("api/masonrystructure")
    @ResponseBody
    public List<MasonrystructureEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (masonrystructureService.getById(did));
    }
}
