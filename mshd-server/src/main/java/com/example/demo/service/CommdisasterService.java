package com.example.demo.service;

import com.example.demo.dao.CommdisasterDao;
import com.example.demo.pojo.CommdisasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommdisasterService {
    @Autowired
    CommdisasterDao commdisasterDao;
    public List<CommdisasterEntity> getById(String id){
        return commdisasterDao.findAllByDid(id);
    }
}
