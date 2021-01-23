package com.example.demo.service;

import com.example.demo.dao.IrrigationdisasterDao;
import com.example.demo.pojo.IrrigationdisasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IrrigationdisasterService {
    @Autowired
    IrrigationdisasterDao irrigationdisasterDao;
    public List<IrrigationdisasterEntity> getById(String id){
        return irrigationdisasterDao.findAllByDiD(id);
    }
}
