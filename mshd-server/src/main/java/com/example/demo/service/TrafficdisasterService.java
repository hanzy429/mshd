package com.example.demo.service;

import com.example.demo.dao.TrafficdisasterDao;
import com.example.demo.pojo.OtherstructureEntity;
import com.example.demo.pojo.TrafficdisasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrafficdisasterService {
    @Autowired
    TrafficdisasterDao trafficdisasterDao;
    public List<TrafficdisasterEntity> getById(String id){
        return trafficdisasterDao.findAllByDiD(id);
    }
}
