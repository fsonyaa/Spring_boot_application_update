package com.example.demo.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "agency_condition")
public class AgencyCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;

    private Integer minAge;
    private Integer licenseAge;
    private Integer maxKiloPerDay;
    private Boolean driverSupRequired = false;
    private Integer minDay;

    @OneToMany(mappedBy = "agencyCondition", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExtraDriverCondition> extraDriverConditions = new ArrayList<>();

    @OneToMany(mappedBy = "agencyCondition", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Availability> availabilities = new ArrayList<>();

    public AgencyCondition() {}

    // --- Getters & Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Agency getAgency() { return agency; }
    public void setAgency(Agency agency) { this.agency = agency; }

    public Integer getMinAge() { return minAge; }
    public void setMinAge(Integer minAge) { this.minAge = minAge; }

    public Integer getLicenseAge() { return licenseAge; }
    public void setLicenseAge(Integer licenseAge) { this.licenseAge = licenseAge; }

    public Integer getMaxKiloPerDay() { return maxKiloPerDay; }
    public void setMaxKiloPerDay(Integer maxKiloPerDay) { this.maxKiloPerDay = maxKiloPerDay; }

    public Boolean getDriverSupRequired() { return driverSupRequired; }
    public void setDriverSupRequired(Boolean driverSupRequired) { this.driverSupRequired = driverSupRequired; }

    public Integer getMinDay() { return minDay; }
    public void setMinDay(Integer minDay) { this.minDay = minDay; }
}
