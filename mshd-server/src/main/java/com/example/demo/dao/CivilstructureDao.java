package com.example.demo.dao;

import com.example.demo.pojo.CivilstructureEntity;
import com.example.demo.pojo.MissingstatisticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CivilstructureDao extends JpaRepository<CivilstructureEntity, Integer> {
    List<CivilstructureEntity> findAllByDiD(String id);
}
