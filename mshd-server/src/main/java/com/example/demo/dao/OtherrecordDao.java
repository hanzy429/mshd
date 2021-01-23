package com.example.demo.dao;

import com.example.demo.pojo.OildisasterEntity;
import com.example.demo.pojo.OtherrecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OtherrecordDao extends JpaRepository<OtherrecordEntity, Integer> {
    List<OtherrecordEntity> findAllByDiD(String id);
}
