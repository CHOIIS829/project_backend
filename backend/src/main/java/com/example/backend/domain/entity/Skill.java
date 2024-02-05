package com.example.backend.domain.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "skills")
@NoArgsConstructor
public class Skill {

    @Id
    @GeneratedValue
    @Column(name = "skill_no")
    private Long skillNo;

    @Column(name = "skill_name")
    private String skillName;
}
