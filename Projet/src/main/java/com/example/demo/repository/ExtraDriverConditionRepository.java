package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ExtraDriverCondition;


public interface ExtraDriverConditionRepository  extends JpaRepository < ExtraDriverCondition, Long> {

}