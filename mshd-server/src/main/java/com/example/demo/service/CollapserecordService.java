package com.example.demo.service;

import com.example.demo.dao.CollapserecordDao;
import com.example.demo.pojo.BrickwoodstructureEntity;
import com.example.demo.pojo.CollapserecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollapserecordService {
    @Autowired
    CollapserecordDao collapserecordDao;
    public List<CollapserecordEntity> getById(String id){
        return collapserecordDao.findAllByDiD(id);
    }
}
