package com.example.demo.dao;

import com.example.demo.pojo.DisasterinfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisasterinfoDao extends JpaRepository<DisasterinfoEntity, Integer> {

    List<DisasterinfoEntity> findAllById(String id);
}
