package com.example.demo.dao;

import com.example.demo.pojo.DeathstatisticsEntity;
import com.example.demo.pojo.InjuredstatisticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InjuredstatisticsDao extends JpaRepository<InjuredstatisticsEntity, Integer> {
    List<InjuredstatisticsEntity> findAllByDiD(String id);
}
