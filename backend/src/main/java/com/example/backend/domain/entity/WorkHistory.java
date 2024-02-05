package com.example.backend.domain.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_history")
@NoArgsConstructor
public class WorkHistory {

    @Id
    @GeneratedValue
    @Column(name = "work_no")
    private Long workNo;

    @Column(name = "work_type")
    private String workType;

    @Column(name = "work_name")
    private String workName;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;
}
