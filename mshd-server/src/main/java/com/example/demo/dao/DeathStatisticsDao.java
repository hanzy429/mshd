package com.example.demo.dao;

import com.example.demo.pojo.DeathstatisticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeathStatisticsDao extends JpaRepository <DeathstatisticsEntity, Integer>{
    List<DeathstatisticsEntity> findAllByDiD(String id);
}
