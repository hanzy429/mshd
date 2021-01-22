package com.example.demo.controller;

import com.example.demo.pojo.DisasterinfoEntity;
import com.example.demo.pojo.IDPageRequest;
import com.example.demo.service.DisasterinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class DisasterinfoController {
    @Autowired
    DisasterinfoService disasterinfoService;
    @CrossOrigin
    @PostMapping("api/disasterInfo")
    @ResponseBody
    public List<DisasterinfoEntity> listbyid(@RequestBody IDPageRequest idPageRequest)throws Exception{

        String did=idPageRequest.getId();
        System.out.println(did);
        return (disasterinfoService.getbyid(did));
    }
}
