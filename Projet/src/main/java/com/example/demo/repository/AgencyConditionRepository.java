package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.AgencyCondition;


public interface AgencyConditionRepository extends  JpaRepository<AgencyCondition, Long> {

}
