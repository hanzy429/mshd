package com.example.demo.service;

import com.example.demo.dao.DeathStatisticsDao;
import com.example.demo.dao.DebrisrecordDao;
import com.example.demo.pojo.DebrisrecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebrisrecordService {
    @Autowired
    DebrisrecordDao debrisrecordDao;
    public List<DebrisrecordEntity> getById(String id){
        return debrisrecordDao.findAllByDiD(id);
    }
}
