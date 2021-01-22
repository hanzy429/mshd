package com.example.demo.dao;

import com.example.demo.pojo.BrickwoodstructureEntity;
import com.example.demo.pojo.CivilstructureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrickwoodstructureDao extends JpaRepository<BrickwoodstructureEntity, Integer> {
    List<BrickwoodstructureEntity> findAllByDiD(String id);
}