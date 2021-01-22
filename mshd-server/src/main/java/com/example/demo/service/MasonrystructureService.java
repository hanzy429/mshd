package com.example.demo.service;

import com.example.demo.dao.MasonrystructureDao;
import com.example.demo.pojo.MasonrystructureEntity;
import com.example.demo.pojo.MissingstatisticsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasonrystructureService {
    @Autowired
    MasonrystructureDao masonrystructureDao;
    public List<MasonrystructureEntity> getById(String id){
        return masonrystructureDao.findAllByDiD(id);
    }

}
