package com.example.demo.dao;

import com.example.demo.pojo.CollapserecordEntity;
import com.example.demo.pojo.CommdisasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollapserecordDao extends JpaRepository<CollapserecordEntity, Integer> {
    List<CollapserecordEntity> findAllByDiD(String id);
}
