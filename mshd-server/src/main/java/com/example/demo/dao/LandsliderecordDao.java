package com.example.demo.dao;

import com.example.demo.pojo.LandsliderecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LandsliderecordDao extends JpaRepository<LandsliderecordEntity, Integer> {
    List<LandsliderecordEntity> findAllByDiD(String id);
}
