package com.example.demo.service;

import com.example.demo.dao.DisasterinfoDao;
import com.example.demo.pojo.DisasterinfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisasterinfoService {

    @Autowired
    DisasterinfoDao disasterinfoDao;
    public List<DisasterinfoEntity>getbyid(String id){
        return disasterinfoDao.findAllById(id);
    }


}
