package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "extra_driver_condition")
public class ExtraDriverCondition {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agency_condition_id")
    private AgencyCondition agencyCondition;

    private Integer minAge;
    private Integer licenseAge;

    public ExtraDriverCondition() {}
    // getters & setters
}
