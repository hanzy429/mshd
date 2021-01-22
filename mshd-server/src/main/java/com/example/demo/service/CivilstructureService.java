package com.example.demo.service;

import com.example.demo.dao.CivilstructureDao;
import com.example.demo.pojo.CivilstructureEntity;
import com.example.demo.pojo.MissingstatisticsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CivilstructureService {
    @Autowired
    CivilstructureDao civilstructureDao;
    public List<CivilstructureEntity> getById(String id){
        return civilstructureDao.findAllByDiD(id);
    }
}
