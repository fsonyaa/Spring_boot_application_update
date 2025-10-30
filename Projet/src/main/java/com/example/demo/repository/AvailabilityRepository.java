package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Availability;


public interface AvailabilityRepository extends  JpaRepository<Availability, Long> {

}
