package com.example.backend.domain.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_no")
    private Long memberNo;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pwd")
    private String memberPwd;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "introduction")
    private String introduction;

    @Column(name = "git")
    private String git;

    @Column(name = "profile")
    private String profile;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @OneToMany
    @JoinColumn(name = "education_no")
    private List<Education> educations;

    @OneToMany
    @JoinColumn(name = "skill_no")
    private List<Skill> skills;

    @OneToMany
    @JoinColumn(name = "work_no")
    private List<WorkHistory> workHistoryList;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Board> boards = new ArrayList<>();
}
