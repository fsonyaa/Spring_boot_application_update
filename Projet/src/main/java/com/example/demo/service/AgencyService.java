package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.repository.AgencyRepository;
import com.example.demo.model.Agency;
import java.util.*;

@Service
public class AgencyService {

    private final AgencyRepository repository;

    public AgencyService(AgencyRepository repository) {
        this.repository = repository;
    }

    public Agency create(Agency a) {
        // si condition n'est pas null, assure la liaison bidirectionnelle
        if (a.getCondition() != null) {
            a.getCondition().setAgency(a);
        }
        return repository.save(a);
    }

    public List<Agency> findAll() {
        return repository.findAll();
    }

    public Optional<Agency> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
