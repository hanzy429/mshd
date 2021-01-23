package com.example.demo.service;

import com.example.demo.dao.SettlementrecordDao;
import com.example.demo.pojo.SettlementrecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettlementrecordService {
    @Autowired
    SettlementrecordDao settlementrecordDao;
    public List<SettlementrecordEntity> getById(String id){
        return settlementrecordDao.findAllByDiD(id);
    }
}
