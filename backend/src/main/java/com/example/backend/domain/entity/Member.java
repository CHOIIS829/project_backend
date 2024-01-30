package com.example.backend.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "member")
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
    @Column(name = "phone")
    private String phone;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "introduction")
    private String introduction;
    @Column(name = "git")
    private String git;
    @Column(name = "create_date")
    private LocalDate createDate;
    @Column(name = "modigied_date")
    private LocalDate modifiedDate;
}
