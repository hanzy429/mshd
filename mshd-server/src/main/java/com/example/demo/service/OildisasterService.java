package com.example.demo.service;

import com.example.demo.dao.OildisasterDao;
import com.example.demo.pojo.OildisasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OildisasterService {
    @Autowired
    OildisasterDao oildisasterDao;
    public List<OildisasterEntity> getById(String id){
        return oildisasterDao.findAllByDiD(id);
    }
}
