package com.example.demo.service;

import com.example.demo.dao.PowerdisasterDao;
import com.example.demo.pojo.PowerdisasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerdisasterService {
    @Autowired
    PowerdisasterDao powerdisasterDao;
    public List<PowerdisasterEntity> getById(String id){
        return powerdisasterDao.findAllByDiD(id);
    }
}
