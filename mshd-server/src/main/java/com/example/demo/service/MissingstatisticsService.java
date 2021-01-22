package com.example.demo.service;


import com.example.demo.dao.MissingstatisticsDao;
import com.example.demo.pojo.InjuredstatisticsEntity;
import com.example.demo.pojo.MissingstatisticsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissingstatisticsService {
    @Autowired
    MissingstatisticsDao missingstatisticsDao;
    public List<MissingstatisticsEntity> getById(String id){
        return missingstatisticsDao.findAllByDiD(id);
    }
}
