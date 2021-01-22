package com.example.demo.service;

import com.example.demo.dao.OtherstructureDao;
import com.example.demo.pojo.MissingstatisticsEntity;
import com.example.demo.pojo.OtherstructureEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherstructureService {
    @Autowired
    OtherstructureDao otherstructureDao;
    public List<OtherstructureEntity> getById(String id){
        return otherstructureDao.findAllByDiD(id);
    }
}
