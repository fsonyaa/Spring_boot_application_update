package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Agency;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {
    List<Agency> findByNom(String nom);
}