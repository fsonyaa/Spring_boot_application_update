package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.dto.AgencyInputRequest;
import com.example.demo.dto.AgencyResponse;
import com.example.demo.model.Agency;
import com.example.demo.service.AgencyService;

@RestController
@RequestMapping("/api/agencies")
@RequiredArgsConstructor
public class AgencyController {

    private final AgencyService agencyService;

    @PostMapping("/create")
    public AgencyResponse createAgency(@RequestBody AgencyInputRequest request) {
        Agency agency = Agency.builder()
                .nom(request.getNom())
                .ville(request.getVille())
                .description(request.getDescription())
                .build();

        Agency saved = agencyService.create(agency);

        return AgencyResponse.builder()
                .id(saved.getId())
                .nom(saved.getNom())
                .ville(saved.getVille())
                .description(saved.getDescription())
                .build();
    }

    @DeleteMapping("/{id}/delete")
    public void deleteAgency(@PathVariable Long id) {
        agencyService.delete(id);
    }

    @PutMapping("/{id}/update")
    public Agency updateAgency(@PathVariable Long id, @RequestBody Agency agency) {
        agency.setId(id);
        return agencyService.create(agency);
    }

    @GetMapping("/{id}")
    public Agency findAgency(@PathVariable Long id) {
        return agencyService.findById(id).orElse(null);
    }

    @GetMapping
    public List<Agency> findAllAgencies() {
        return agencyService.findAll();
    }

    @GetMapping("/by-name")
    public List<Agency> findByNom(@RequestParam String nom) {
        return agencyService.findByNom(nom);
    }
}