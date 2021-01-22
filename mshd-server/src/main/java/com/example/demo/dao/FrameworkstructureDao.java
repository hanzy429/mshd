package com.example.demo.dao;

import com.example.demo.pojo.FrameworkstructureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FrameworkstructureDao extends JpaRepository<FrameworkstructureEntity, Integer> {
        List<FrameworkstructureEntity> findAllByDiD(String id);
        }
