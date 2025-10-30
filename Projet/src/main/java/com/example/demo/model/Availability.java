package com.example.demo.model;



import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "availability")
public class Availability {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agency_condition_id")
    private AgencyCondition agencyCondition;

    private String type; // DEPART/RETOUR/BOTH
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    private String customLocation;

    private LocalTime startTime;
    private LocalTime endTime;
    private Boolean fullDay = false;

    public Availability() {}
    // getters & setters
}
