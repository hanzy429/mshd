package com.example.demo.dao;

import com.example.demo.pojo.OtherstructureEntity;
import com.example.demo.pojo.TrafficdisasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrafficdisasterDao extends JpaRepository<TrafficdisasterEntity, Integer> {
    List<TrafficdisasterEntity> findAllByDiD(String id);
}