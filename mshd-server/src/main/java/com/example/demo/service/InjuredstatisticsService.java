package com.example.demo.service;

import com.example.demo.dao.InjuredstatisticsDao;
import com.example.demo.pojo.DeathstatisticsEntity;
import com.example.demo.pojo.InjuredstatisticsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InjuredstatisticsService {
    @Autowired
    InjuredstatisticsDao injuredstatisticsDao;
    public List<InjuredstatisticsEntity> getById(String id){
        return injuredstatisticsDao.findAllByDiD(id);
    }
}
