package com.example.demo.dao;

import com.example.demo.pojo.TrafficdisasterEntity;
import com.example.demo.pojo.WaterdisasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WaterdisasterDao extends JpaRepository<WaterdisasterEntity, Integer> {
    List<WaterdisasterEntity> findAllByDiD(String id);
}
