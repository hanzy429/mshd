package com.example.demo.service;

import com.example.demo.pojo.DeathstatisticsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.DeathStatisticsDao;

import java.util.List;

@Service
public class DeathStatisticsService {
    @Autowired
    DeathStatisticsDao deathStatisticsDao;
    public List<DeathstatisticsEntity>getById(String id){
        return deathStatisticsDao.findAllByDiD(id);
    }
}
