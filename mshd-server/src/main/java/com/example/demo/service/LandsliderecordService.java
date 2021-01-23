package com.example.demo.service;

import com.example.demo.dao.LandsliderecordDao;
import com.example.demo.pojo.LandsliderecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandsliderecordService {
    @Autowired
    LandsliderecordDao landsliderecordDao;
    public List<LandsliderecordEntity> getById(String id){
        return landsliderecordDao.findAllByDiD(id);
    }
}
