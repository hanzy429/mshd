package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.PowerdisasterEntity;
import com.example.demo.service.PowerdisasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class PowerdisasterController {
    @Autowired
    PowerdisasterService powerdisasterService;
    @CrossOrigin
    @PostMapping("api/powerdisaster")
    @ResponseBody
    public List<PowerdisasterEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (powerdisasterService.getById(did));
    }
}
