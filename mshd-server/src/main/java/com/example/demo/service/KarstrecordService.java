package com.example.demo.service;

import com.example.demo.dao.KarstrecordDao;
import com.example.demo.pojo.KarstrecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KarstrecordService {
    @Autowired
    KarstrecordDao karstrecordDao;
    public List<KarstrecordEntity> getById(String id){
        return karstrecordDao.findAllByDiD(id);
    }
}
