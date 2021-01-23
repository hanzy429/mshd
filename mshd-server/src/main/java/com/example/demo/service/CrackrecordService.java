package com.example.demo.service;

import com.example.demo.dao.CrackrecordDao;
import com.example.demo.pojo.CrackrecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrackrecordService {
    @Autowired
    CrackrecordDao crackrecordDao;
    public List<CrackrecordEntity> getById(String id){
        return crackrecordDao.findAllByDiD(id);
    }
}
