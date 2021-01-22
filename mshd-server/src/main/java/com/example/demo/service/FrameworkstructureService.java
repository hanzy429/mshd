package com.example.demo.service;

import com.example.demo.dao.FrameworkstructureDao;
import com.example.demo.pojo.FrameworkstructureEntity;
import com.example.demo.pojo.MissingstatisticsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrameworkstructureService {
    @Autowired
    FrameworkstructureDao frameworkstructureDao;
    public List<FrameworkstructureEntity> getById(String id){
        return frameworkstructureDao.findAllByDiD(id);
    }
}
