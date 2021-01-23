package com.example.demo.service;

import com.example.demo.dao.WaterdisasterDao;
import com.example.demo.pojo.TrafficdisasterEntity;
import com.example.demo.pojo.WaterdisasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterdisasterService {
    @Autowired
    WaterdisasterDao waterdisasterDao;
    public List<WaterdisasterEntity> getById(String id){
        return waterdisasterDao.findAllByDiD(id);
    }
}
