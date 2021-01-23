package com.example.demo.dao;

import com.example.demo.pojo.CommdisasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommdisasterDao extends JpaRepository<CommdisasterEntity, Integer> {
    List<CommdisasterEntity> findAllByDid(String id);
}
