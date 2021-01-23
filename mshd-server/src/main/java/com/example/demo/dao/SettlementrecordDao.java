package com.example.demo.dao;

import com.example.demo.pojo.SettlementrecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SettlementrecordDao extends JpaRepository<SettlementrecordEntity, Integer> {
    List<SettlementrecordEntity> findAllByDiD(String id);
}
