package com.example.demo.model;



import jakarta.persistence.*;

@Entity
@Table(name = "location")
public class Location {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    // constructor, getters & setters
}
