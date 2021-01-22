package com.example.demo.service;

import com.example.demo.dao.BrickwoodstructureDao;
import com.example.demo.pojo.BrickwoodstructureEntity;
import com.example.demo.pojo.CivilstructureEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrickwoodstructureService {
    @Autowired
    BrickwoodstructureDao brickwoodstructureDao;
    public List<BrickwoodstructureEntity> getById(String id){
        return brickwoodstructureDao.findAllByDiD(id);
    }
}
