package com.example.demo.dao;

import com.example.demo.pojo.IrrigationdisasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IrrigationdisasterDao extends JpaRepository<IrrigationdisasterEntity, Integer> {
    List<IrrigationdisasterEntity> findAllByDiD(String id);
}
