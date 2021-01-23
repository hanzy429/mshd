package com.example.demo.service;

import com.example.demo.dao.OtherrecordDao;
import com.example.demo.dao.OtherstructureDao;
import com.example.demo.pojo.OtherrecordEntity;
import com.example.demo.pojo.PowerdisasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherrecordService {
    @Autowired
    OtherrecordDao otherrecordDao;
    public List<OtherrecordEntity> getById(String id){
        return otherrecordDao.findAllByDiD(id);
    }
}
