package com.example.demo.service;

import com.example.demo.model.Agency;
import com.example.demo.repository.AgencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AgencyService {

    private final AgencyRepository repository;

    public Agency create(Agency agency) {
        return repository.save(agency);
    }

    public List<Agency> findAll() {
        return repository.findAll();
    }

    public Optional<Agency> findById(Long id) {
        return repository.findById(id);
    }

    public List<Agency> findByNom(String nom) {
        return repository.findByNom(nom);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}