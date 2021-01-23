package com.example.demo.dao;

import com.example.demo.pojo.DebrisrecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DebrisrecordDao extends JpaRepository<DebrisrecordEntity, Integer> {
    List<DebrisrecordEntity> findAllByDiD(String id);
}
