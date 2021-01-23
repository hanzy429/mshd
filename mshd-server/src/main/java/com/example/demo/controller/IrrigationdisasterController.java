package com.example.demo.controller;

import com.example.demo.pojo.IDPageRequest;
import com.example.demo.pojo.IrrigationdisasterEntity;
import com.example.demo.service.IrrigationdisasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class IrrigationdisasterController {
    @Autowired
    IrrigationdisasterService irrigationdisasterService;
    @CrossOrigin
    @PostMapping("api/irrigationdisaster")
    @ResponseBody
    public List<IrrigationdisasterEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        return (irrigationdisasterService.getById(did));
    }
}
