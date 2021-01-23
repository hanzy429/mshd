package com.example.demo.service;

import com.example.demo.dao.GasdisasterDao;
import com.example.demo.pojo.GasdisasterEntity;
import com.example.demo.pojo.OildisasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GasdisasterService {
    @Autowired
    GasdisasterDao gasdisasterDao;
    public List<GasdisasterEntity> getById(String id){
        return gasdisasterDao.findAllByDiD(id);
    }
}
