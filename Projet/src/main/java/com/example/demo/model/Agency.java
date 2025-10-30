package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "agency")
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country = "Tunisie";
    private String city;
    private String governorate;
    private String address;
    private Integer size;

    @Lob
    private byte[] logo;

    @OneToOne(mappedBy = "agency", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private AgencyCondition condition;

    public Agency() {}

    // --- Getters & Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getGovernorate() { return governorate; }
    public void setGovernorate(String governorate) { this.governorate = governorate; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Integer getSize() { return size; }
    public void setSize(Integer size) { this.size = size; }

    public byte[] getLogo() { return logo; }
    public void setLogo(byte[] logo) { this.logo = logo; }

    public AgencyCondition getCondition() { return condition; }

    public void setCondition(AgencyCondition condition) {
        this.condition = condition;
        if (condition != null) {
            condition.setAgency(this);
        }
    }
}
