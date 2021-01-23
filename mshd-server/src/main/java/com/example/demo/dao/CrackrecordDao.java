package com.example.demo.dao;

import com.example.demo.pojo.CrackrecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrackrecordDao extends JpaRepository<CrackrecordEntity, Integer> {
    List<CrackrecordEntity> findAllByDiD(String id);
}
