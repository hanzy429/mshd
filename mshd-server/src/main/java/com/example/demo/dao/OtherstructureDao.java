package com.example.demo.dao;

import com.example.demo.pojo.MissingstatisticsEntity;
import com.example.demo.pojo.OtherstructureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OtherstructureDao extends JpaRepository<OtherstructureEntity, Integer> {
    List<OtherstructureEntity> findAllByDiD(String id);
}
