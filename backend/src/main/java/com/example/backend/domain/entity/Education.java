package com.example.backend.domain.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "educations")
@NoArgsConstructor
public class Education {

    @Id
    @GeneratedValue
    @Column(name = "education_no")
    private Long educationNo;

    @Column(name = "degree")
    private String degree;

    @Column(name = "major")
    private String major;

    @Column(name = "school")
    private String school;

    @Column(name = "gradution_date")
    private LocalDate gradutionDate;
}
