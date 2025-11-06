package com.example.demo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgencyResponse {
    private Long id;
    private String nom;
    private String ville;
    private String description;
}