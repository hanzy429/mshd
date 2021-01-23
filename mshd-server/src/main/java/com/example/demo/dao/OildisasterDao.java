package com.example.demo.dao;

import com.example.demo.pojo.OildisasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OildisasterDao extends JpaRepository<OildisasterEntity, Integer> {
    List<OildisasterEntity> findAllByDiD(String id);
}
