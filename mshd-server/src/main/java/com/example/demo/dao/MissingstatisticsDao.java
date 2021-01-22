package com.example.demo.dao;

import com.example.demo.pojo.InjuredstatisticsEntity;
import com.example.demo.pojo.MissingstatisticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissingstatisticsDao extends JpaRepository<MissingstatisticsEntity, Integer> {
    List<MissingstatisticsEntity> findAllByDiD(String id);
}
