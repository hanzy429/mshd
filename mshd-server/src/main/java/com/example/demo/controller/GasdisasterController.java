package com.example.demo.controller;

import com.example.demo.pojo.GasdisasterEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.service.GasdisasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class GasdisasterController {
    @Autowired
    GasdisasterService gasdisasterService;
    @CrossOrigin
    @PostMapping("api/gasdisaster")
    @ResponseBody
    public List<GasdisasterEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (gasdisasterService.getById(did));
    }
}
