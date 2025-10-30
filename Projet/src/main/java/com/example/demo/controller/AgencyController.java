package com.example.demo.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Agency;
import com.example.demo.service.AgencyService;
import java.util.*;

@RestController
@RequestMapping("/api/agencies")
public class AgencyController {

    private final AgencyService service;

    public AgencyController(AgencyService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Agency> create(@RequestBody Agency agency) {
        Agency saved = service.create(agency);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public List<Agency> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agency> get(@PathVariable Long id) {
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
