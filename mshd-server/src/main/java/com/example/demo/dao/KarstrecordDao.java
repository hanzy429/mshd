package com.example.demo.dao;

import com.example.demo.pojo.KarstrecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KarstrecordDao extends JpaRepository<KarstrecordEntity, Integer> {
    List<KarstrecordEntity> findAllByDiD(String id);
}
